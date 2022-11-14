package chapters.chapter_10;

public class Q_02 {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Yusuf", 27, 80, 1.85);
        BMI bmi2 = new BMI("Yunus", 85, 1.80);
        BMI bmi3 = new BMI("Burak", 15, 80, 5, 10);

        bmi1.print();
        System.out.println("------------");
        bmi2.print();
        System.out.println("------------");
        bmi3.print();
    }
}
