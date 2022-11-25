package chapters.chapter_10;

import java.math.BigDecimal;

public class Q_16 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("10000000000000000000000000000000000000000000000000");
        int count = 0;

        while (count < 10){
            BigDecimal remainder2 = bigDecimal.remainder(BigDecimal.valueOf(2L));
            BigDecimal remainder3 = bigDecimal.remainder(BigDecimal.valueOf(3L));

            if (remainder2.intValue() == 0 || remainder3.intValue() == 0){
                System.out.println(bigDecimal);
                count++;
            }
            bigDecimal = bigDecimal.add(BigDecimal.ONE);
        }
    }
}
