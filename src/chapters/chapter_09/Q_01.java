package chapters.chapter_09;

public class Q_01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Width of rectangle 1: " + rectangle1.width);
        System.out.println("Height of rectangle 1: " + rectangle1.height);
        System.out.println("Area of rectangle 1: " + rectangle1.getArea());
        System.out.println("Perimeter of rectangle 1: " + rectangle1.getPerimeter());
        System.out.println("-------------------------");
        System.out.println("Width of rectangle 2: " + rectangle2.width);
        System.out.println("Height of rectangle 2: " + rectangle2.height);
        System.out.println("Area of rectangle 2: " + rectangle2.getArea());
        System.out.println("Perimeter of rectangle 2: " + rectangle2.getPerimeter());

    }
}
