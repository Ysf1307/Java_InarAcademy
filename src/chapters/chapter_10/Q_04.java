package chapters.chapter_10;

public class Q_04 {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println("The distance between points is " + point1.distance(point2));
    }
}
