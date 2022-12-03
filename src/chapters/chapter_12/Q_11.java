package chapters.chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) throws Exception {
        String toRemove = args[0];
        File sourceCode = new File(args[1]);
        Scanner input = new Scanner(sourceCode);

        if (!sourceCode.exists()) {
            System.out.println("The sourceCode " + sourceCode.getName() + " does not exist");
            System.exit(1);
        }

        String str1 = "";
        String str2 = "";

        while (input.hasNext()) {
            str1 += input.nextLine();
            str2 = str1.replaceAll(toRemove, "");
        }

        File targetFile = new File(toRemove + "_Revised.txt");

        try (PrintWriter out = new PrintWriter(targetFile);) {
            out.print(str2);
        }
        input.close();
        System.out.println("Your edited file is complete");
    }
}