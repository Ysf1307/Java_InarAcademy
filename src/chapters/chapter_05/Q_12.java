package chapters.chapter_05;

public class Q_12 {

    public static void main(String[] args) {

        int n = 0;
        int n_2 = n * n;

        while (n_2 < 12000){
            n++;
            n_2 = n * n;

        }


        System.out.println(n);
        System.out.println(n_2);
    }
}
