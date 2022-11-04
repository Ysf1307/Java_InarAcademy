package chapters.chapter_07;

public class Q_06 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int count = 0;
        int number = 2;
        primeNumbers[0] = number;
        number++;

        while (count < 50){
            if (isPrime(number)){
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.printf("%3d ", primeNumbers[i]);
            if (i % 10 == 9) {
                System.out.println();
            }
        }

    }
    public static boolean isPrime(int number){
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}


/*
int[] primeNumbers = new int[50];
        int number = 2;
        primeNumbers[0] = number;
        number++;


        for (int i = 1; i < primeNumbers.length; i++) {
            int divisor = 2;
            while (divisor <= Math.sqrt(number)){
                if (number % divisor == 0) {
                    number++;
                    continue;
                }
                divisor++;
            }
            primeNumbers[i] = number;
            number++;
        }
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.printf("%3d ", primeNumbers[i]);
            if (i % 10 == 9) {
                System.out.println();
            }
        }
 */