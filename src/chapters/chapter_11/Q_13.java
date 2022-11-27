package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfElements = 10;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter " + numberOfElements + " integers:");
        for (int i = 0; i < numberOfElements; i++) {
            list.add(input.nextInt());
        }
        removeDuplicate(list);
        System.out.println("The distinct integers are " + list.toString());
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> tempList = new ArrayList<>();
        tempList.addAll(list);
        list.clear();
        for (int i = 0; i < tempList.size(); i++) {
            if (!list.contains(tempList.get(i))){
                list.add(tempList.get(i));
            }
        }
    }
}
