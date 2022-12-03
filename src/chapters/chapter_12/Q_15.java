package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Q_15 {
    public static ArrayList<Integer> lines = new ArrayList<>();
//C:\Users\yertu\workspace\InarAcademy\Java_InarAcademy\src\chapters\chapter_12
    public static void main(String[] args) {
       Random random = new Random();
        boolean success = true;
        File file = new File("Java_InarAcademy" + File.separator + "src" + File.separator + "chapters" + File.separator + "chapter_12" +
                File.separator + "Q_15.txt");
        if (!file.exists()){
            try {
                success = file.createNewFile();
            }
            catch (IOException ex){
                success = false;
                ex.printStackTrace();
            }
        }
        if (success){
            try (PrintWriter printWriter = new PrintWriter(file)){
                for (int i = 0; i < 100; i++) {
                    printWriter.write(String.valueOf(random.nextInt(1000)));
                    printWriter.write(" ");
                }
            }
            catch (FileNotFoundException ex){
                ex.printStackTrace();
            }

            try (Scanner fileIn = new Scanner(file)){
                while (fileIn.hasNextLine()){
                    String[] line = fileIn.nextLine().split(" ");
                    for (int i = 0; i < line.length; i++) {
                        lines.add(Integer.parseInt(line[i]));
                    }
                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
            System.out.println(lines.toString());
            Collections.sort(lines);
            System.out.println(lines.toString());
        }
    }
}
