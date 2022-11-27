package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfElements = 5;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Enter " + numberOfElements + " integers for list1:");
        for (int i = 0; i < numberOfElements; i++) {
            list1.add(input.nextInt());
        }
        System.out.println("Enter " + numberOfElements + " integers for list2");
        for (int i = 0; i < numberOfElements; i++) {
            list2.add(input.nextInt());
        }

        System.out.println("The combined list is " + union(list1,list2).toString());
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> unionList = new ArrayList<>();
        unionList.addAll(list1);
        unionList.addAll(list2);
        return unionList;
    }
}
