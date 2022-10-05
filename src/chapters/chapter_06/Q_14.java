package chapters.chapter_06;

public class Q_14 {
    public static void main(String[] args) {

        System.out.println("i\t\t\tm(i)\n-------------------------");

        for (double i = 1; i < 1000; i += 100) {

            System.out.println(i + "\t\t\t" + piEstimation(i));
        }
    }
    public static double piEstimation(double i){

        double result = 0;

        for (double j = 1; j <= i; j++) {
            result += (Math.pow(-1, (i+1))) / ((2 * i) - 1);
        }
        result = result * 4;
        return result;
    }
}
