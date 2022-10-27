package chapters.chapter_07;

import java.util.Scanner;

public class Q_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list 1");
        int numberOfElementsList1 = input.nextInt();
        int[] list1 = new int[numberOfElementsList1];
        for (int i = 0; i < numberOfElementsList1; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Enter list 2");
        int numberOfElementsList2 = input.nextInt();
        int[] list2 = new int[numberOfElementsList2];
        for (int i = 0; i < numberOfElementsList2; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }
    }
    public static boolean equals(int[] list1, int[] list2){
        boolean identical = true;
        boolean[] isChecked = new boolean[list1.length];

        if (list1.length != list2.length) {
            identical = false;
        }

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (!isChecked[j] && list1[i] == list2[j]){
                    isChecked[j] = true;
                }
            }
        }

        for (int i = 0; i < isChecked.length; i++) {
            if (!isChecked[i]){
                identical = false;
                break;
            }
        }
        return identical;
    }
}
