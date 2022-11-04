package chapters.chapter_09;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c values");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation eqn1 = new QuadraticEquation(a, b, c);

        double discriminant = eqn1.getDiscriminant();
        if (discriminant > 0){
            System.out.println("a: " + eqn1.getA());
            System.out.println("b: " + eqn1.getB());
            System.out.println("c: " + eqn1.getC());
            System.out.println("Discriminant: " + eqn1.getDiscriminant());
            System.out.println("Root1: " + eqn1.getRoot1());
            System.out.println("Root2: " + eqn1.getRoot2());    
        } else if (discriminant == 0) {
            System.out.println("a: " + eqn1.getA());
            System.out.println("b: " + eqn1.getB());
            System.out.println("c: " + eqn1.getC());
            System.out.println("Discriminant: " + eqn1.getDiscriminant());
            System.out.println("Root: " + eqn1.getRoot1());
        }else {
            System.out.println("a: " + eqn1.getA());
            System.out.println("b: " + eqn1.getB());
            System.out.println("c: " + eqn1.getC());
            System.out.println("Discriminant: " + eqn1.getDiscriminant());
            System.out.println("There is no real roots");
        }
    }
}
