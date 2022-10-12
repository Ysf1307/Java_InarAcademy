package chapters.chapter_06;

import java.util.Scanner;

public class Q_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter points x0 and y0 points for P0: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        System.out.println("Enter points x1 and y1 points for P1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter points x2 and y2 points for P2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        if (leftOfTheLine(x0, y0, x1, y1, x2, y2)){
            System.out.println("(" + x2 + " " + y2 + ") is on the left side of the line from ( " + x0 + " " + y0 + ") to (" + x1 + " " + y1 + ")");
        }
        if (onTheSameLine(x0, y0, x1, y1, x2, y2)){
            System.out.println("(" + x2 + " " + y2 + ") is on the same line from ( " + x0 + " " + y0 + ") to (" + x1 + " " + y1 + ")");
        }
        if (onTheLineSegment(x0, y0, x1, y1, x2, y2)){
            System.out.println("(" + x2 + " " + y2 + ") is on the line segment from ( " + x0 + " " + y0 + ") to (" + x1 + " " + y1 + ")");
        }
    }
    public static boolean leftOfTheLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2){

        boolean result = false;
        double equation = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));
        if (equation > 0){
            result = true;
        }
        return result;
    }
    public static boolean onTheSameLine(double x0, double y0,
                                        double x1, double y1, double x2, double y2){

        boolean result = false;
        double equation = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));
        if (equation == 0){
            result = true;
        }
        return result;
    }
    public static boolean onTheLineSegment(double x0, double y0,
                                           double x1, double y1, double x2, double y2){

        boolean result = false;
        double equation = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));
        if (equation < 0){
            result = true;
        }
        return result;
    }
}
