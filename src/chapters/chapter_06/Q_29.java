package chapters.chapter_06;

public class Q_29 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i) == true && isPrime(i+2) == true){
                System.out.println("(" + i + ", " + (i+2) + ")");
            }
        }
    }
    public static boolean isPrime (int number){

        boolean prime = false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                prime = false;
                break;
            }
            else{
                prime = true;
            }
        }
        return prime;
    }
}
