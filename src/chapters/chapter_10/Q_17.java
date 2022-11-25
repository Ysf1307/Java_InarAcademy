package chapters.chapter_10;

import java.math.BigInteger;

public class Q_17 {
    public static void main(String[] args) {

        int count = 0;
        BigInteger maxLongValue = BigInteger.valueOf(Long.MAX_VALUE);
        Long rootNumber = (long) Math.sqrt(maxLongValue.doubleValue());
        BigInteger root = BigInteger.valueOf(rootNumber);

        while (count < 10){
            root = root.add(BigInteger.ONE);
            BigInteger number = root.pow(2);
            System.out.println(number);
            count++;
        }
    }
}
