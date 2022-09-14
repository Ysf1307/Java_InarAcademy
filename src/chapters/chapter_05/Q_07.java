package chapters.chapter_05;

public class Q_07 {

    public static void main(String[] args) {

        double tuition = 10_000;
        double total = 0;
        System.out.println("Current Tuition: " + tuition);


        for (int i = 1; i < 11; i++){
            tuition += tuition * 0.05;
            System.out.println(i + ". Year Tuition: " + tuition);

        }

        for (int i = 0; i < 14; i++){
            tuition += tuition * 0.05;
            if (i > 10){
                total = total + tuition;
            }
        }
        System.out.println("\nTotal Tuition: " + total);
    }
}
