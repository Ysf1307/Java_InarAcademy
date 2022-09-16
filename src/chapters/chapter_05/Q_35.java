package chapters.chapter_05;

public class Q_35 {
    public static void main(String[] args) {

        double sum = 0;

        for (double i = 1 ; i < 625 ; i=i+1){
            sum += 1 / ((Math.sqrt(i)) + (Math.sqrt(i+1)));
        }
        System.out.println(sum);
    }
}
