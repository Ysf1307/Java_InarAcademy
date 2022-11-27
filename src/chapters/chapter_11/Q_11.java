package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfElements = 5;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter " + numberOfElements + " integer values:");
        for (int i = 0; i < numberOfElements; i++) {
            list.add(input.nextInt());
        }
        System.out.println("List before sort: " + list.toString());
        sort(list);
        System.out.println("List after sort: " + list.toString());
    }
    public static void sort(ArrayList<Integer> list){
        ArrayList<Integer> tempList = new ArrayList<>();
        tempList.addAll(list);
        list.clear();
        while (!tempList.isEmpty()){
            list.add(Collections.min(tempList));
            tempList.remove(Collections.min(tempList));
        }
    }
}
