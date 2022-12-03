package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter file name:");
        String filePath = "src" + File.separator + "chapter_12" + File.separator + input.nextLine().trim();
        File file = new File(filePath);

        try (Scanner fileScanner = new Scanner(file)){
            ArrayList<Double> scores = new ArrayList<>();
            while (fileScanner.hasNext()){
                String value = fileScanner.next();
                scores.add(Double.parseDouble(value));
            }
            double total = 0;
            for (int i = 0; i < scores.size(); i++) {
                total += scores.get(i);
            }
            double average = total / scores.size();
            System.out.printf("\nTotal: %.2f ", total);
            System.out.printf("\nAverage: %.2f", average);
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
            System.out.println("Could not find this file " + file.getAbsolutePath());
        }
        input.close();
    }
}
