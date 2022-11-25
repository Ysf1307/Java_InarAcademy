package chapters.chapter_10;

import java.util.Arrays;

public class MyString2 {
    char[] chars;

    public MyString2(String str){
        this.chars = str.toCharArray();
    }


    public MyString2 substring(int begin){
        char[] chars1 = new char[chars.length - begin];
        for (int i = 0; i < chars1.length; i++) {
            chars1[i] = chars[begin];
            begin++;
        }
        return new MyString2(Arrays.toString(chars1));
    }
    public MyString2 toUpperCase(){
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            chars1[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString2(Arrays.toString(chars1));
    }
    public char[] toChars(){
        return chars;
    }
    public static MyString2 valueOf(boolean b){
        return b ? new MyString2("true"): new MyString2("false");
    }
}
