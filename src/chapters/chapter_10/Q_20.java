package chapters.chapter_10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Q_20 {
    public static void main(String[] args) {
        BigDecimal e = BigDecimal.ONE;
        for (int i = 1; i <= 100; i++) {
            BigDecimal numerator = BigDecimal.ONE;
            BigDecimal denominator = new BigDecimal(getFactorial(i));
            BigDecimal result = numerator.divide(denominator,25,BigDecimal.ROUND_UP);
            e = e.add(result);
        }
        System.out.println(e);
        System.out.println("---------------------------");
        e = BigDecimal.ONE;
        for (int i = 1; i <= 200; i++) {
            BigDecimal numerator = BigDecimal.ONE;
            BigDecimal denominator = new BigDecimal(getFactorial(i));
            BigDecimal result = numerator.divide(denominator,25,BigDecimal.ROUND_UP);
            e = e.add(result);
        }
        System.out.println(e);
        System.out.println("---------------------------");
        e = BigDecimal.ONE;
        for (int i = 1; i <= 1000; i++) {
            BigDecimal numerator = BigDecimal.ONE;
            BigDecimal denominator = new BigDecimal(getFactorial(i));
            BigDecimal result = numerator.divide(denominator,25,BigDecimal.ROUND_UP);
            e = e.add(result);
        }
        System.out.println(e);
    }
    public static BigInteger getFactorial(int x){
        BigInteger number = BigInteger.ONE;
        for (int i = 1; i <= x; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        return number;
    }
}
