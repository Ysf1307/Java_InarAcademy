package chapters.chapter_05;

public class Q_05 {

    public static void main(String[] args) {

        double kilogram1 = 1;
        double pound1 = kilogram1 * 2.2;
        double pound2 = 20;
        double kilogram2 = pound2 / 2.2;

        System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");

        for (int i = 0; i < 100; i++){
            pound1 = kilogram1 * 2.2;
            kilogram2 = pound2 / 2.2;

            System.out.printf("%.0f\t\t\t%.2f\t|\t%.0f\t\t%.2f\n",kilogram1,pound1,pound2,kilogram2);
            kilogram1 += 2;
            pound2 += 5;
        }
    }
}
