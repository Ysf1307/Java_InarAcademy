package chapters.chapter_05;

public class Q_33 {
    public static void main(String[] args) {

        String output = "";


        for (int number = 2; number < 10000;number++){
            int sum = 0;
            for (int divisor = 1; divisor < number; divisor++){
                if (number % divisor == 0){
                    sum += divisor;
                }
            }
            if (sum == number){
                output += number + "\n";
            }
        }
        System.out.println(output);
    }
}
