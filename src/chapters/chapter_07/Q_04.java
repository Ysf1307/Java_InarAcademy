package chapters.chapter_07;

import java.util.Scanner;

public class Q_04 {

    private static double[] scores = new double[100];
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter scores:");

        createList();
        average();
        numberOfScoresEqualToAverage();
        numberOfScoresBelowAverage();
        numberOfScoresAboveAverage();
        printResult();
    }

    public static void createList() {
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextDouble();
            if (scores[i] < 0){
                return;
            }
        }
    }

    public static double average() {
        double averageScore = 0;
        double sum = 0;
        int i = 0;

        while (scores[i] >= 0){
            sum += scores[i];
            i++;
        }
        averageScore = sum / i;

        return averageScore;
    }

    public static int numberOfScoresEqualToAverage() {
        int countEqualtoAverage = 0;
        int i = 0;
        while (scores[i] >= 0){
            if (scores[i] == average()){
                countEqualtoAverage++;
            }
            i++;
        }
        return countEqualtoAverage;
    }

    public static int numberOfScoresBelowAverage() {
        int countBelowAverage = 0;
        int i = 0;
        while (scores[i] >= 0){
            if (scores[i] < average()){
                countBelowAverage++;
            }
            i++;
        }
        return countBelowAverage;
    }

    public static int numberOfScoresAboveAverage() {
        int countAboveAverage = 0;
        int i = 0;
        while (scores[i] >= 0){
            if (scores[i] > average()){
                countAboveAverage++;
            }
            i++;
        }
        return countAboveAverage;
    }

    public static void printResult() {
        System.out.println("Average of Scores: " + average());
        System.out.println("Scores Equal to the Average: " + numberOfScoresEqualToAverage());
        System.out.println("Scores Below the Average: " + numberOfScoresBelowAverage());
        System.out.println("Scores Above the Average: " + numberOfScoresAboveAverage());
    }
}
