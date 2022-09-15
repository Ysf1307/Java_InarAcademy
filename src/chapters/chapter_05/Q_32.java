package chapters.chapter_05;

import java.util.Scanner;

public class Q_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int random = (int)(Math.random()*10);
        String temp = random + "";
        String lottery = temp.charAt(0) + "";


        while (true){
           random = (int)(Math.random()*10);
           temp = random + "";
           if (temp.charAt(0) == lottery.charAt(0)){
               continue;
           }
           else {
               lottery += temp;
               break;
           }
        }
        System.out.println(lottery);


        System.out.print("Enter your lottery pick (2 digits): ");
        String guess = input.next();

        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("The lottery number is " + lottery);

        if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
            System.out.println("Exact match: you win $10,000");
        }
        else if ( guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 ) {
            System.out.println("Match all digits: you win $3,000");
        }
        else if (guessDigit1 == lotteryDigit1
                ^ guessDigit1 == lotteryDigit2
                ^ guessDigit2 == lotteryDigit1
                ^ guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win $1,000");
        }
        else {
            System.out.println("Sorry, no match");
        }
    }
}
