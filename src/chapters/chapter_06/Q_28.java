package chapters.chapter_06;

public class Q_28 {
    public static void main(String[] args) {
        double p = 2;
        double number = 0;
        System.out.println("p\t\t2^p-1\n-------------------------");

        while (p <= 31){
            number = Math.pow(2, p) - 1;
            if (isPrime(number) == true){
                System.out.println(p + "\t\t" +number);
            }
            p++;
        }
    }
    public static boolean isPrime (double number){

        boolean prime = false;

        for (int i = 2; i < number/2; i++) {
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
