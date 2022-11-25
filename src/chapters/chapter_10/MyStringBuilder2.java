package chapters.chapter_10;


import java.util.Arrays;
import java.util.StringTokenizer;

public class MyStringBuilder2 {
    char[] chars;


    public MyStringBuilder2(){
        this("".toCharArray());
    }
    public MyStringBuilder2(char[] chars){
        this.chars = chars;
    }
    public MyStringBuilder2(String s){
        this.chars = s.toCharArray();
    }


    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        char[] newArray = new char[s.chars.length + offset];
        System.arraycopy(this.chars,0,newArray,0,offset);
        System.arraycopy(s.chars, 0, newArray,offset,s.chars.length);
        this.chars = newArray;
        return this;
    }
    public MyStringBuilder2 reverse(){
        char[] newArray = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            newArray[i] = chars[(chars.length-1)-i];
        }
        this.chars = newArray;
        return this;
    }
    public MyStringBuilder2 substring(int begin){
        char[] newArray = new char[chars.length-begin];
        System.arraycopy(chars,begin,newArray,0,chars.length-begin);
        this.chars = newArray;
        return this;
    }
    public MyStringBuilder2 toUpperCase(){
        char[] newArray = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            newArray[i] = Character.toUpperCase(chars[i]);
        }
        this.chars = newArray;
        return this;
    }
    public String toString(){
        return String.valueOf(this.chars);
    }
}
