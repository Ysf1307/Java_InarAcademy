package chapters.chapter_07;

import java.util.Scanner;

public class Q_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] yearName = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.println("Enter year");
        int year = input.nextInt();

        System.out.println(yearName[year % 12]);
    }
}
