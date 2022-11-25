package chapters.chapter_10;

import java.math.BigInteger;

public class Q_21 {
    public static void main(String[] args) {

        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE);
        final BigInteger FIVE = BigInteger.valueOf(5L);
        final BigInteger SIX = BigInteger.valueOf(6L);
        int count = 0;

        while (count < 10){
            number = number.add(BigInteger.ONE);
            BigInteger remainder5 = number.remainder(FIVE);
            BigInteger remainder6 = number.remainder(SIX);

            if (remainder5.intValue() == 0 || remainder6.intValue() == 0){
                System.out.println(number);
                count++;
            }
        }
    }
}
