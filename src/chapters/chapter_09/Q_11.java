package chapters.chapter_09;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e and f values respectly");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation eqn = new LinearEquation(a, b, c, d, e, f);

        if (!eqn.isSolvable()){
            System.out.println("The equation has no solution.");
        }else {
            System.out.println("X Value is " + eqn.getX());
            System.out.println("Y Value is " + eqn.getY());
        }
    }
}
