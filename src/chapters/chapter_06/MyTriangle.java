package chapters.chapter_06;

public class MyTriangle {
    public static void main(String[] args) {

    }
    public static boolean isValid(double side1, double side2, double side3){
        boolean validation = false;

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            validation = true;
        }
        return validation;
    }
    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(( s * (s-side1) * (s-side2) * (s-side3)), 0.5);

        return area;
    }
}
