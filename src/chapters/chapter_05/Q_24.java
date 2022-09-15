package chapters.chapter_05;

public class Q_24 {
    public static void main(String[] args) {

        double sum = 0;

        for (double i = 1, j = 3;i < 98;i =i + 2, j =j + 2){
            sum += (i / j);
        }
        System.out.println("Summation is " + sum);
    }
}
