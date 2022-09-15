package chapters.chapter_05;

public class Q_20 {
    public static void main(String[] args) {

        String output = "";

        int counter = 0;
        int temp = 0;

        for (int number = 2; number <= 1000; number++) {
            temp = 0;
            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    temp++;

                }
            }
            if (temp == 0) {
                output += number + " ";
                counter++;

            }
            if (counter == 8) {
                output += "\n";
                counter = 0;
            }
        }


        System.out.println(output);
    }
}
