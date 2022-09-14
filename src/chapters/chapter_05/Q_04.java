package chapters.chapter_05;

public class Q_04 {

    public static void main(String[] args) {

        int mile = 1;
        double kilometer = mile * 1.609;
        System.out.println("Miles \t Kilometers");

        for (int i = 0; i < 10; i++){
            kilometer = mile * 1.609;
            System.out.println(mile + " \t " + kilometer);
            mile++;

        }
    }
}
