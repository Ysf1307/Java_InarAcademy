package chapters.chapter_05;

import java.util.Scanner;

public class Q_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int temp = 1;
        int count = 1;

        while (temp != 0){
            System.out.println("Enter an integer value (Enter '0' for exit): ");
            temp = input.nextInt();
            if (temp > number){
                number = temp;
                count = 1;
            }
            else if (temp == number) {
                count++;
            }
            else {
                continue;
            }
        }
        System.out.println("The largest number is " + number);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
