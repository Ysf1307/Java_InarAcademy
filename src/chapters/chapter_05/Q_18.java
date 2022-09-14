package chapters.chapter_05;
import java.util.Scanner;
public class Q_18 {
    public static void main(String[] args) {

        Pattern_D();
    }

    public static void Pattern_A(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines:");
        int line = input.nextInt();
        String output = "";

        for (int i = 0; i < line; i++){
            for (int j = 0; j < (i+1); j++){
                output += (j+1) + " ";
            }
            output += ("\n");
        }
        System.out.println(output);


    }
    public static void Pattern_B(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines:");
        int line = input.nextInt();
        String output = "";

        for (int i = 0; i < line; i++){
            for (int j = 0; j < (line-i); j++){
                output += (j+1) + " ";
            }
            output += "\n";
        }
        System.out.println(output);

    }
    public static void Pattern_C(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines:");
        int line = input.nextInt();
        String output ="";

        for (int i = 0; i < line; i++){
            for (int j = 1; j < (line-i);j++){
                output += "  ";
            }
            for (int k = 1; k < (i+2); k++){
                output += " " + k;
            }
            for (int l = 0; l < (line-i); l++){
                output += "  ";
            }
            output += "\n";
        }
        System.out.println(output);
    }
    public static void Pattern_D(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int line = input.nextInt();
        String output = "";

        for (int i = 0; i < line; i++){
            for (int j = 0; j < i; j++){
                output += "  ";
            }
            for (int k = 0; k < (line - i); k++){
                output += (k+1) + " ";
            }
            output += "\n";
        }
        System.out.println(output);

    }

}
