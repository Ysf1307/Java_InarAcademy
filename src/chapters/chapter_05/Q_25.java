package chapters.chapter_05;

public class Q_25 {
    public static void main(String[] args) {

        double pi = 0;

        for (int i = 1; i <= 10000; i++){
            pi += ( Math.pow( -1, i + 1 ) ) / ( 2 * i - 1 );
        }
        pi = 4 * pi;
        System.out.println("Pi for 'i = 10 000' : " + pi);

        pi = 0;
        for (int i = 1; i <= 20000; i++){
            pi += ( Math.pow( -1, i + 1 ) ) / ( 2 * i - 1 );
        }
        pi = 4 * pi;
        System.out.println("Pi for 'i = 20 000' : " + pi);

        pi = 0;
        for (int i = 1; i <= 100000; i++){
            pi += ( Math.pow( -1, i + 1 ) ) / ( 2 * i - 1 );
        }
        pi = 4 * pi;
        System.out.println("Pi for 'i = 100 000' : " + pi);


    }
}
