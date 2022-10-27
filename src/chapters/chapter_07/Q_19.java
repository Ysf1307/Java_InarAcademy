package chapters.chapter_07;

import java.util.Scanner;

public class Q_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements in the list");
        int numberOfElements = input.nextInt();

        System.out.println("Enter elements of the list");
        int[] numbers = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = input.nextInt();
        }

        boolean isSorted = isSorted(numbers);

        if (isSorted){
            System.out.println("The list is already sorted");
        }
        else {
            System.out.println("The list is not sorted");
        }
    }
    public static boolean isSorted(int[] list){
        boolean isSorted = true;
        for (int i = 0; i < list.length-1; i++) {
            if (list[i] > list[i+1]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
}
