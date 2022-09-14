package chapters.chapter_05;

public class Q_20 {
    public static void main(String[] args) {

        String output = "";
        int temp = 0;
        int counter = 0;

        for (int number = 3; number <= 1000; number++){
            for (int divisor = 2; divisor < number; divisor++){
                if (number % divisor == 0){
                    temp++;
                }
            }
            if (temp == 0){
                output += number + " ";
                counter++;
                            }
            if (counter % 8 ==0){
                output = "\n";
            }
            else {
                continue;
            }
        }
        System.out.println(output);
    }
}
