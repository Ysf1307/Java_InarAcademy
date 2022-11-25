package chapters.chapter_10;

import java.math.BigInteger;

public class Q_19 {
    public static void main(String[] args) {

        System.out.println("P\t\t(2^P - 1)");
        for (int i = 2; i <= 100; i++) {
            BigInteger mersennePrime = BigInteger.TWO.pow(i).subtract(BigInteger.ONE);
            System.out.println(i + "\t\t" + mersennePrime);
        }
    }
}
