package chapters.chapter_12;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q_21 {
    public static void main (String args[]){
        String nextStr = "";
        String lastStr = "";
        int strCount = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(
                "Java_InarAcademy\\src\\chapters\\chapter_12\\Q_21SortedStrings.txt"))){
            while ((nextStr = bufferedReader.readLine()) != null){
                if (strCount++ == 0){
                    lastStr = nextStr;
                    continue;
                }
                if (!isIncreasingOrder(lastStr,nextStr)){
                    System.out.println("The strings are not in increasing order...");
                    System.out.println("The first occurrence of two Strings out of order are "
                            + lastStr + " " + "and " + nextStr);
                    break;
                }
                lastStr = nextStr;
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static boolean isIncreasingOrder(String s1, String s2) {
        return s1.compareTo(s2) < 0;
    }
}
