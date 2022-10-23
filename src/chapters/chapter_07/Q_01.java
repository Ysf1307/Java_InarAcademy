package chapters.chapter_07;

import java.util.Random;
import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = input.nextInt();
        double[] grades = new double[numberOfStudents];

        System.out.println("Enter " + numberOfStudents + " scores:");

        for (int i = 0; i < grades.length; i++) {
            grades[i] = input.nextDouble();
        }
        String[] assignmentOfGrades = assignmentOfGrades(grades, numberOfStudents);

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + assignmentOfGrades[i]);
        }
    }
    public static int indexOfBestScore(double[] grades){
        int index = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > grades[index]){
                index = i;
            }
        }
        return index;
    }
    public static String[] assignmentOfGrades(double[] grades, int numberOfStudents){
        String[] assignments = new String[numberOfStudents];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= (grades[indexOfBestScore(grades)] - 10)){
                assignments[i] = "A";
            }
            else if (grades[i] < (grades[indexOfBestScore(grades)] - 10) && grades[i] >= (grades[indexOfBestScore(grades)] - 20)) {
                assignments[i] = "B";
            }
            else if (grades[i] < (grades[indexOfBestScore(grades)] - 20) && grades[i] >= (grades[indexOfBestScore(grades)] - 30)) {
                assignments[i] = "C";
            }
            else if (grades[i] < (grades[indexOfBestScore(grades)] - 30) && grades[i] >= (grades[indexOfBestScore(grades)] - 40)) {
                assignments[i] = "D";
            }
            else {
                assignments[i] = "F";
            }
        }
        return assignments;
    }
}
