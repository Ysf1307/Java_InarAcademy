package chapters.chapter_05;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = " ";
        double score = 0;
        double highestScore_1 = 0;
        double highestScore_2 = 0;

        while (true){
            System.out.println("Enter student's name (Enter 'e' to exit) : ");
            name = input.next();
            if (name == "e"){
                break;
            }
            System.out.println("Enter student's score");
            score = input.nextDouble();

            if (score > highestScore_1 && score > highestScore_2){
                double temp = highestScore_1;
                highestScore_1 = score;
                highestScore_2 = temp;
            }

            else if (score > highestScore_2){
                    highestScore_2 = score;
                }
            else{
                    continue;
                }

        }
    }
}
