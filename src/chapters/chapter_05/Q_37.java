package chapters.chapter_05;

import java.util.Scanner;

public class Q_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value");
        int decimal = input.nextInt();
        String binary = "";

        while (decimal > 0){
            binary += (decimal % 2) + "";
            decimal = decimal / 2;
        }

        System.out.println(binary);
    }
}
