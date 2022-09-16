package chapters.chapter_05;

import java.util.Scanner;

public class Q_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double comission = 0;
        double salesAmount = 0;

        System.out.println("Enter the comission sought:");
        double comissionSought = input.nextDouble();

        if (comissionSought <= 400){
            for (salesAmount = 0;comission < comissionSought; salesAmount++){
                comission = salesAmount * 0.08;
            }
        }
        else if (comissionSought > 400 && comissionSought <= 900){
            for (salesAmount = 0;comission < comissionSought; salesAmount++){
                comission = 400 + (salesAmount - 5000) * 0.1;
            }
        }
        else {
            for (salesAmount = 0;comission < comissionSought; salesAmount++){
                comission = 900 + (salesAmount - 10000) * 0.12;
            }
        }
        System.out.println("Comission sought: " + comissionSought + "\n\nSales Amount: " + salesAmount + "\nComission: " + comission);
    }
}
