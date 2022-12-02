package chapters.chapter_12;

import java.util.Random;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumber.nextInt(1000);
        }
        System.out.println("Enter an index in the array for which to display it's value: ");
        try {
            int index = input.nextInt();
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Incorrect index");
        }
        input.close();
    }
}
