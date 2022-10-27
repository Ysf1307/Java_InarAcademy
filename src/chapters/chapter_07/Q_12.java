package chapters.chapter_07;

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(reverseArray(array)[i] + " ");
        }

    }
    public static int[] reverseArray(int[] array){
        int[] reverseArray = new int[10];

        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length-1-i];
        }
        return reverseArray;
    }
}
