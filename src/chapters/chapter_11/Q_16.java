package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Q_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        int number1 = randomNumber.nextInt(10);
        int number2 = randomNumber.nextInt(10);

        System.out.println("What is result of " + number1 + " + " + number2 + " ?");
        int answer = input.nextInt();
        answerList.add(answer);

        while (answer != number1 + number2) {
            System.out.println("Wrong answer. Try again. What is result of " + number1 + " + " + number2 + " ?");
            answer = input.nextInt();
            if (answerList.contains(answer)) {
                System.out.println("You already entered " + answer);
            } else {
                answerList.add(answer);
            }
        }
        System.out.println("You got it !");
    }
}
