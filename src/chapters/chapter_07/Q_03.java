package chapters.chapter_07;

import java.util.Scanner;

public class Q_03 {

    private static Scanner input = new Scanner(System.in);
    private static int[] list = new int[100];

    public static void main(String[] args) {

        System.out.println("Enter integer values:");

        readAndCountNumbers();
        printOccurence();
    }

    public static void readAndCountNumbers() {

        while (true){
            int number = input.nextInt();
            if (number > 0 && number < 100){
                list[number-1]++;
            }
            else if (number == 0) {
                return;
            }
            else continue;
        }
    }

    public static void printOccurence() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0){
                System.out.println((i+1) + " occurs " + list[i] + " time" + (list[i] > 1 ? "s" : ""));
            }
        }
    }
}
