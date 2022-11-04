package chapters.chapter_09;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return Math.pow(b, 2) - (4*a*c);


    }
    public double getRoot1(){
        double root = (-b + Math.sqrt(getDiscriminant())) / (2*a);
        return root;
    }
    public double getRoot2(){
        double root = (-b - Math.sqrt(getDiscriminant())) / (2*a);
        return root;
    }
}
