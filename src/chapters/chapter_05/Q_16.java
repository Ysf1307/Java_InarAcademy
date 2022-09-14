package chapters.chapter_05;

import java.util.Scanner;

public class Q_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer value:");
        int number = input.nextInt();
        int factor = 2;
        String result = "";

        while (factor <= number){
            if (number % factor == 0){
                result += factor + " ";
                number = number / factor;
            }
            else {
                factor++;
            }
        }
        System.out.println(result);


    }
}
