package chapters.chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Q_16 {
    private static ArrayList<String> strHelper = new ArrayList<>();

    public static void main(String[] args) {
        if (args.length < 3){
            System.out.println("Run: java Exercise12_16 fileName oldString newString");
            System.out.println(args.length);
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()){
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        try (Scanner input = new Scanner(sourceFile)){
            while (input.hasNext()){
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[1], args[2]);
                strHelper.add(s2);
            }
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(sourceFile)){
            for (int i = 0; i < strHelper.size(); i++) {
                printWriter.println(strHelper.remove(i));
            }
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
