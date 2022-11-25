package chapters.chapter_10;

import java.util.Arrays;

public class Q_23 {
    public static void main(String[] args) {

        String s = "Yusuf";
        MyString2 str = new MyString2(s);

        System.out.println("Substring: " + Arrays.toString(str.substring(1).chars));
        System.out.println("Uppercase: " + Arrays.toString(str.toUpperCase().chars));
        System.out.println("toChar: " + Arrays.toString(str.toChars()));
    }
}
