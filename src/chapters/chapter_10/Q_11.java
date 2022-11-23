package chapters.chapter_10;

public class Q_11 {
    public static void main(String[] args) {

        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("The area is " + c1.getArea());
        System.out.println("The perimeter is " + c1.getPerimeter());
        System.out.println("Is the circle contains the points: " + c1.contains(3,3));
        System.out.println("Is the circle contains the other circle: " + c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("Is the circle overlaps the other circle: " + c1.contains(new Circle2D(3,5,2.3)));

    }
}
