package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();
        int numberOfElements = 5;
        System.out.println("Enter " + numberOfElements + " double values to sum:");
        for (int i = 0; i < numberOfElements; i++) {
            list.add(input.nextDouble());
        }

        System.out.println("Sum of values is " + sum(list));
    }
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
