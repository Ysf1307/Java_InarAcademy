package chapters.chapter_07;

import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of balls to drop:");
        int numberOfBalls = input.nextInt();
        System.out.println("Enter the number of slots in the bean machine:");
        int numberOfSlots = input.nextInt();


        for (int i = 0; i < numberOfBalls; i++) {
            String[] path = new String[numberOfSlots];
            for (int j = 0; j < numberOfSlots; j++) {
                int fall = (int)(Math.random()*2);
                if (fall == 0){
                    path[j]= "L";
                }
                else {
                    path[j]= "R";
                }
            }
            for (int j = 0; j < numberOfSlots; j++) {
                System.out.print(path[j]);
            }
            System.out.println();
        }
    }
}
