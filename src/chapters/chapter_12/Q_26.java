package chapters.chapter_12;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Q_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter directory name:");
        File file = new File(input.next());

        if (!file.exists() && !file.isDirectory()){
            file.mkdir();
            System.out.println("“Directory created successfully");
        } else {
            System.out.println("Directory already exists");
        }
    }
}
