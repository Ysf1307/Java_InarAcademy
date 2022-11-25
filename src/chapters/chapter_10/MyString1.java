package chapters.chapter_10;

public class MyString1 {
    char[] chars;


    public MyString1() {

    }

    public MyString1(char[] chars) {
        this.chars = chars;
    }


    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        int newLength = end - begin;
        char[] newChars = new char[newLength];
        for (int i = 0; i < newLength; i++) {
            newChars[i] = chars[begin];
            begin++;
        }
        return new MyString1(newChars);
    }

    public MyString1 toLowerCase() {
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            newChars[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(newChars);
    }

    public boolean equals(MyString1 s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.chars[i] != chars[i]) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        CharSequence ch = i + "";
        return new MyString1(new char[]{ch.charAt(0)});
    }


}
