package chapters.chapter_06;

public class Q_10 {
    public static void main(String[] args) {
        System.out.println("The prime numbers less than 10 000 are \n");
        printPrimeNumbers();
    }
    public static void printPrimeNumbers(){

        int number = 2;
        int count = 0;
        String output = "";

        for (number = 02; number < 10000; number++) {
            if (isPrime(number) == true){
                count++;
                output += number + "\t";
            }
            if (count == 10){
                output += "\n";
                count = 0;
            }
        }
        System.out.println(output);
    }
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}

