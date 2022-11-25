package chapters.chapter_10;

import java.util.Arrays;

public class Q_22 {
    public static void main(String[] args) {

        char[] chars = {'Y','u','S','u','f'};
        MyString1 str = new MyString1(chars);
        char[] chars1 = {'Y','u','s','u','f'};
        MyString1 str1 = new MyString1(chars);

        System.out.println("CharAt: " + str.charAt(3));
        System.out.println("Length: " + str.length());
        System.out.println("Substring: " + Arrays.toString(str.substring(0,3).chars));
        System.out.println("Lowercase: " + Arrays.toString(str.toLowerCase().chars));
        System.out.println("Equals: " + str.equals(str1));
        System.out.println("Value Of: " + Arrays.toString(str.valueOf(2).chars));
    }
}
