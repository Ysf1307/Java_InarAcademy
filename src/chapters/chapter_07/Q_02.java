package chapters.chapter_07;
import java.util.Scanner;


public class Q_02 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Enter 10 integer value:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        int[] reverseList = reverseNumber(numbers, numbers.length);

        printList(reverseList);
    }

    private static void printList(int[] reverseList) {
        for (int i = 0; i < reverseList.length; i++) {
            System.out.printf("%2d", reverseList[i]);
        }
    }

    private static int[] reverseNumber(int[] numbers, int length) {
        int[] reverseList = new int[length];

        for (int i = 0; i < length; i++) {
            reverseList[length - 1 - i] = numbers[i];
        }
        return reverseList;
    }

}
