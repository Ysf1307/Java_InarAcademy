package chapters.chapter_09;

import java.util.Random;

public class Q_04 {
    public static void main(String[] args) {

        Random randomNumber = new Random(1000);

        int count = 0;

        while (count < 50){
            System.out.printf("%3d", randomNumber.nextInt(100));
            count++;
            if (count % 10 == 0){
                System.out.println();
            }
        }
    }
}
