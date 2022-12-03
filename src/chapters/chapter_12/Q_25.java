package chapters.chapter_12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q_25 {
    public static void main(String[] args) {
        double totalSalaryAssistant = 0;
        double totalSalaryAssociate = 0;
        double totalSalaryFull = 0;
        int countAssistant = 0;
        int countAssociate = 0;
        int countFull = 0;

        File file = new File("Java_InarAcademy\\src\\chapters\\chapter_12\\Salary.txt");

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()){
                String[] employeeRecord = input.nextLine().split("\\s+");
                if (employeeRecord[2].equals("assistant")){
                    countAssistant++;
                    totalSalaryAssistant += Double.parseDouble(employeeRecord[3]);
                } else if (employeeRecord[2].equals("associate")) {
                    countAssociate++;
                    totalSalaryAssociate += Double.parseDouble(employeeRecord[3]);
                } else if (employeeRecord[2].equals("full")) {
                    countFull++;
                    totalSalaryFull += Double.parseDouble(employeeRecord[3]);
                }
            }
            double totalSalaryAll = totalSalaryAssistant + totalSalaryAssociate + totalSalaryFull;

            System.out.println("Total salary for assistant professors: " + totalSalaryAssistant);
            System.out.println("Total salary for associate professors: " + totalSalaryAssociate);
            System.out.println("Total salary for full professors: " + totalSalaryFull);

            System.out.println("Average salary for assistant professors: " + average(totalSalaryAssistant,countAssistant));
            System.out.println("Average salary for associate professors: " + average(totalSalaryAssociate,countAssociate));
            System.out.println("Average salary for full professors: " + average(totalSalaryFull,countFull));
        } catch (IOException ex){
            ex.printStackTrace();
            System.out.println("Scanner couldn't read from the Salary.txt file...");
        }
    }
    public static double average(double total, int count){
        return total/count;
    }
}
