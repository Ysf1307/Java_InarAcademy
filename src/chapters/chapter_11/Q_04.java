package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers ('0' ends program):");
        while (true){
            int number = input.nextInt();
            if (number == 0){
                break;
            }
            else{
                list.add(number);
            }
        }
        System.out.println("The maximum number in the list is " + max(list));
    }
    public static Integer max(ArrayList<Integer> list){
        return Collections.max(list);
    }
}
