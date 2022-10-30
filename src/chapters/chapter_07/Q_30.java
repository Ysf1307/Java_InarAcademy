package chapters.chapter_07;

import java.util.Scanner;

public class Q_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of values:");
        int numberOfElements = input.nextInt();

        int[] list = new int[numberOfElements];
        System.out.println("Enter the values:");
        for (int i = 0; i < numberOfElements; i++) {
            list[i] = input.nextInt();
        }


        if (isConsecutiveFour(list)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        boolean isConsecutive = true;
        boolean[] check = new boolean[4];

        for (int i = 0; i < values.length; i++) {
            int number = values[i];

            for (int j = 0; j < check.length; j++) {
                check[j] = false;
            }

            for (int j = 0; j < 4; j++) {
                number++;
                for (int l = 0; l < values.length; l++) {
                    if (number == values[l]) {
                        check[j] = true;
                        break;
                    }
                }
            }

            for (int k = 0; k < check.length; k++) {
                if (!check[k]) {
                    isConsecutive = false;
                    break;
                }
            }
            if (isConsecutive) {
                return isConsecutive;
            } else continue;
        }
        return isConsecutive;
    }
}
