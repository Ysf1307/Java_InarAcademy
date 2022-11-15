package chapters.chapter_10;

public class MyPoint {

    private double x = 0;
    private double y = 0;

    public MyPoint() {
    }
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(double x1, double y1) {
        double x2 = this.x;
        double y2 = this.y;

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public double distance(MyPoint point) {
        return distance(point.x, point.y);

    }
}
