package chapters.chapter_05;

public class Q_03 {
    public static void main(String[] args) {

        double kilogram = 1;
        double pound = kilogram * 2.2;

        System.out.println("Kilograms \t Pounds");

        for (int i = 0; i < 100; i++ ){
            pound = kilogram * 2.2;
            System.out.println(kilogram + " \t " + pound);
            kilogram = kilogram + 2;

        }
    }
}
