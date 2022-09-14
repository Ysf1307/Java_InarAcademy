package chapters.chapter_05;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = "";
        double score = 0;
        double highestScore = 0;

        while (true){
            System.out.println("Enter student's name (Enter 'e' to exit) : ");
            name = input.next();
            if (name == "e"){
                break;
            }
            System.out.println("Enter student's score");
            score = input.nextDouble();

            if(score > highestScore){
                highestScore = score;
            }
        }

        System.out.println("Highest Score\n" + name + "\n" + highestScore );
    }
}
