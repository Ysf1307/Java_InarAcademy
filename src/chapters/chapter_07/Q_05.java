package chapters.chapter_07;
import java.util.Scanner;
public class Q_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Ten Numbers:");
        int[] numbers = new int[10];
        int lengthOfNewList = 0;
        int number;

        for (int i = 0; i < numbers.length; i++) {
            number = input.nextInt();
            for (int j = 0; j <= i; j++) {
                if (number == numbers[j]){
                    continue;
                }
                else {
                    numbers[i] = number;
                    lengthOfNewList++;
                }
            }
        }

        for (int i = 0; i < lengthOfNewList; i++) {
            System.out.printf("%d ", numbers[i]);
        }
    }
}
