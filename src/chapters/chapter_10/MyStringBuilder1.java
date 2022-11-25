package chapters.chapter_10;

public class MyStringBuilder1 {
    char[] values;


    public MyStringBuilder1(String s){
        values = s.toCharArray();
    }


    public MyStringBuilder1 append(MyStringBuilder1 s){
        int oldLength = this.values.length;
        char[] newValues = new char[oldLength + s.values.length];
        System.arraycopy(this.values,0,newValues,0,oldLength);
        System.arraycopy(s.values,0,newValues,oldLength,s.values.length);
        this.values = newValues;
        return this;
    }
    public MyStringBuilder1 append(int i){
        int oldLength = values.length;
        String str = i + "";
        char[] newValues = new char[oldLength + str.length()];
        char[] intArray = new char[str.length()];
        intArray = str.toCharArray();
        System.arraycopy(values,0,newValues,0,oldLength);
        System.arraycopy(intArray,0,newValues,oldLength,intArray.length);
        this.values = newValues;
        return this;
    }
    public int length(){
        return values.length;
    }
    public char charAt(int index){
        return values[index];
    }
    public MyStringBuilder1 toLowerCase(){
        char[] newArray = new char[values.length];
        for (int i = 0; i < values.length; i++) {
            newArray[i] = Character.toLowerCase(values[i]);
        }
        return new MyStringBuilder1(String.valueOf(newArray));
    }
    public MyStringBuilder1 subString(int begin, int end){
        char[] newArray = new char[end - begin];
        System.arraycopy(values,begin,newArray,0,end-begin);
        return new MyStringBuilder1(String.valueOf(newArray));
    }
    public String toString(){
        return String.valueOf(values);
    }
}
