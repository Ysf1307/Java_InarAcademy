package chapters.chapter_07;

public class Q_06 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int number = 2;
        primeNumbers[0] = number;
        number++;


        for (int i = 1; i < primeNumbers.length; i++) {
            for (int j = 2; j < Math.sqrt(number); j++) {
                if (Math.sqrt(number) % j == 0) {           // New Approach (Math.sqrt)
                    number++;
                    continue;
                }
            }
            primeNumbers[i] = number;
            number++;
        }
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.printf("%2d ", primeNumbers[i]);
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
