package chapters.chapter_07;

import java.util.Scanner;

public class Q_17 {

    private  static String[] namesOfStudents;
    private static double[] scoresOfStudents;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter number of Students:");
        int numberOfStudents = input.nextInt();

        namesOfStudents = new String[numberOfStudents];
        scoresOfStudents = new double[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter " + (i+1) + ". Student's Name:");
            namesOfStudents[i] = input.next();
            System.out.println("Enter " + (i+1) + ". Student's Score:");
            scoresOfStudents[i] = input.nextDouble();
        }

        sortList(numberOfStudents);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(namesOfStudents[i] + " : " + scoresOfStudents[i]);
        }

    }
    public static void sortList(int numberOfStudents){
        double greatestScore = 0;
        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            greatestScore = scoresOfStudents[i];
            firstIndex = i;
            for (int j = i; j < numberOfStudents-1; j++) {
                if (scoresOfStudents[j+1] > greatestScore){
                    greatestScore = scoresOfStudents[j+1];
                    secondIndex = j+1;
            }
        }
            String tempName = namesOfStudents[firstIndex];
            namesOfStudents[firstIndex] = namesOfStudents[secondIndex];
            namesOfStudents[secondIndex] = tempName;
            double tempScore = scoresOfStudents[firstIndex];
            scoresOfStudents[firstIndex] = scoresOfStudents[secondIndex];
            scoresOfStudents[secondIndex] = tempScore;
        }
    }
}
