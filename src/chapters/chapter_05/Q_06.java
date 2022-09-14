package chapters.chapter_05;

public class Q_06 {

    public static void main(String[] args) {

        double mile_1 = 1;
        double kilometer_1 = mile_1 * 1.609;
        double kilometer_2 = 20;
        double mile_2 = kilometer_2 / 1.609;

        System.out.println("Miles\tKilometers\t\t|\tKilometers\tMiles");

        for (int i = 0; i < 10; i++){
            kilometer_1 = mile_1 * 1.609;
            mile_2 = kilometer_2 / 1.609;

            System.out.println(mile_1 + "\t\t" + kilometer_1 + "\t\t\t|\t" + kilometer_2 + "\t\t" + mile_2);

            mile_1++;
            kilometer_2 +=5;

        }
    }
}
