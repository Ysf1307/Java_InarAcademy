package chapters.chapter_12;

public class Q_05 {
    public static void main(String[] args) {

        System.out.println("Enter values of triangle");
        try {
            Triangle triangle = new Triangle(1.0,0.1,0.2);
            System.out.println("The area of triangle is " + triangle.getArea());
        }
        catch (IllegalTriangelException ex){
            System.out.println(ex);
        }

        System.out.println("Enter values of triangle");
        try {
            Triangle triangle = new Triangle(1,1,1);
            System.out.println("The area of triangle is " + triangle.getArea());
        }
        catch (IllegalTriangelException ex){
            System.out.println(ex);
        }
    }
}
