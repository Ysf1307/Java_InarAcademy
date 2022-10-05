package chapters.chapter_06;

public class Q_13 {
    public static void main(String[] args) {

        int finalNumber = 20;
        double sum = 0;

        System.out.println("i\t\tm(i)\n--------------------");

        for (int i = 1; i <= finalNumber; i++) {
            sum = sumSeries(i);
            System.out.println(i + "\t\t" + sum);
        }
    }
    public static double sumSeries(int finalNumber){

        double sum = 0;

        for (double i = 1; i <= finalNumber ; i++) {
            sum += i / (i + 1);
        }
        return sum;
    }
}
