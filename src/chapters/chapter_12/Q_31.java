package chapters.chapter_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Year:");
        int year = input.nextInt();
        System.out.println("Enter the Gender:");
        String gender = input.nextLine();
        System.out.println("Enter the Name:");
        String name = input.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL("http://www.cs.armstrong.edu/liang/data/babynamesranking" +
                    year + ".txt");

            input = new Scanner(url.openStream());
            while (input.hasNext()){
                for (int i = 0; i < 5; i++) {
                    list.add(i, input.next());
                }
                if (list.get(gender(gender)).equals(name)){
                    System.out.println(name + " is ranked #" + list.get(0) + " in year " + year);
                    System.exit(0);
                }
                list.clear();
            }
        } catch (java.net.MalformedURLException ex1){
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex2){
            System.out.println("I/O Error: no such file");
        }
        System.out.println("The name " + name + " is not ranked in year " + year);
    }

    public static int gender(String gender) {
        if (gender.equals("M"))
            return 1;
        else
            return 3;    }
}
