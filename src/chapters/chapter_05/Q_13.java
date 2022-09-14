package chapters.chapter_05;

public class Q_13 {

    public static void main(String[] args) {

        int n = 0;
        int n_3 = n * n * n;

        while (n_3 < 12000){
            n++;
            n_3 = n * n * n;

        }
        n = n - 1;
        n_3 = n * n * n;

        System.out.println(n);
        System.out.println(n_3);


    }
}
