package chapters.chapter_05;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = "";
        String highestScoreName_1 = "";
        String highestScoreName_2 = "";
        double score = 0;
        double highestScore_1 = 0;
        double highestScore_2 = 0;

        while (true){
            System.out.println("Enter student's name (Enter 'e' to exit) : ");
            name = input.next();
            if (name.equals("e")){
                break;
            }
            System.out.println("Enter student's score");
            score = input.nextDouble();

            if (score > highestScore_1 && score > highestScore_2){
                double temp = highestScore_1;
                highestScore_1 = score;
                highestScore_2 = temp;
                String tempName = highestScoreName_1;
                highestScoreName_1 = name;
                highestScoreName_2 = tempName;
            }

            else if (score > highestScore_2){
                    highestScore_2 = score;
                    highestScoreName_2 = name;
                }
            else{
                    continue;
                }

        }
        System.out.println("1." + highestScoreName_1 + " " + highestScore_1);
        System.out.println("2." + highestScoreName_2 + " " + highestScore_2);

    }
}
