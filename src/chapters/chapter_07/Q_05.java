package chapters.chapter_07;
import java.util.Scanner;
public class Q_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int number;
        int index = 1;

        System.out.println("Enter Ten Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinctNumbers = new int[10];
        distinctNumbers[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]){
                    count++;
                }
            }
            if (count == 0){
                distinctNumbers[index] = numbers[i];
                index++;
            }
        }

        for (int i = 0; i < distinctNumbers.length; i++) {
            if ((distinctNumbers[i] + distinctNumbers[i+1]) == 0){
                break;
            }
            System.out.printf("%d ", distinctNumbers[i]);
        }
    }
}
