package chapters.chapter_05;

import java.util.Scanner;

public class Q_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfQuestions = 10;
        int count = 0;
        String result = " ";
        int time1 = (int)(System.currentTimeMillis() / 1000);

        while (count < numberOfQuestions){
            int number1 = (int)(Math.random() * 14 + 1);
            int number2 = (int)(Math.random() * 14 + 1);

            if (number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.println("Question " + (count + 1) + ": " + number1 + " - " + number2 + " = ?"  );
            int answer = input.nextInt();

            if (answer == (number1 - number2)) {
                System.out.println("Your answer is correct!");
                result += "\n" + number1 + " - " + number2 + " = " + answer + " correct";
            }
            else{
                System.out.println("Your answer is wrong! \n" + number1 + " - " + number2 + " = " + (number1 - number2) );
                result += "\n" + number1 + " - " + number2 + " = " + answer + " wrong";
            }
            count++;
        }
        int time2 = (int)(System.currentTimeMillis() / 1000);

        System.out.println("\n Quiz Time: " + (time2 - time1));
        System.out.println(result);
    }
}
