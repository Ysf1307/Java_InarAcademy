package chapters.chapter_05;
import java.util.Scanner;
public class Q_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines:");
        int line = input.nextInt();
        String output ="";

        for (int i = 0; i < line; i++){
            for (int j = 1; j < (line-i);j++){
                output += "  ";
            }
            for (int k = 1; k < (i+2); k++){
                output += " " + (i+2-k);
            }
            for (int m = 0; m < i; m++){
                if (i > 0){
                    output += " " + (m+2);
                }
            }
            for (int l = 0; l < (line-i); l++){
                output += "  ";
            }
            output += "\n";
        }
        System.out.println(output);
    }
}
