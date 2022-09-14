package chapters.chapter_05;

import java.util.Scanner;

public class Q_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String question = "Enter an integer, the input ends if it is 0:";


        int number = 1;
        int positive = 0;
        int negative = 0;
        int total = 0;
        double average = 0;

        while(number != 0){
            System.out.println(question);
            number = input.nextInt();
            if (number > 0){
                positive++;
            } else if (number < 0){
                negative++;
            }
            else {
                break;
            }
            total = total + number;
        }


        System.out.println("The number of positives is: " + positive);
        System.out.println("The number of negatives is: " + negative);
        System.out.println("The total is: " + total);
        if (total != 0 && (positive > 0 || negative > 0)){
            average = total / (positive + negative);
            System.out.println("The average is: " + average);
        }
        else {
            System.out.println("Average cannot be calculated");
        }
    }
}
