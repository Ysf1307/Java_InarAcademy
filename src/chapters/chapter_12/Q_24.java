package chapters.chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

public class Q_24 {
    public static void main(String[] args) {
        File file = new File("Java_InarAcademy\\src\\chapters\\chapter_12\\Salary.txt");
        System.out.println(file.getAbsolutePath());

        try (PrintWriter printWriter = new PrintWriter(file)){
            for (int numberOfLines = 1; numberOfLines <= 1000;numberOfLines++){
                String rank = getRank();
                double salary = getSalary(rank);
                String recordBuilder = ("FirstName" + numberOfLines + " LastName" + numberOfLines +
                        " " + rank + " " + String.format("%.2f",salary));
                printWriter.println(recordBuilder.toString());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    public static String getRank(){
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;
        String rank = "";
        switch (randomNumber){
            case 1:
                rank = "assistant";
                break;
            case 2:
                rank = "associate";
                break;
            case 3:
                rank = "full";
                break;
        }
        return rank;
    }
    public static double getSalary(String rank){
        Random random = new Random();
        double salary = 0;
        switch (rank){
            case "assistant":
                salary = random.nextDouble(50_000,80_000);
                break;
            case "associate":
                salary = random.nextDouble(60_000,110_000);
                break;
            case "full":
                salary = random.nextDouble(75_000,130_000);
                break;
        }
        return salary;
    }
}
