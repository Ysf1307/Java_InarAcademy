package chapters.chapter_10;

public class Circle2D {
    private double x;
    private double y;
    private double radius;


    public Circle2D(){
        this(0, 0, 1);
    }
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI * Math.pow(radius, 2));
    }
    public double getPerimeter(){
        return (2 * Math.PI * radius);
    }
    public boolean contains(double x, double y){
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return (distance < radius);
    }
    public boolean contains(Circle2D circle){
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return (radius > circle.radius + distance);
    }
    public boolean overlaps(Circle2D circle){
        double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
        return (radius < circle.radius + distance && distance < radius + circle.radius);
    }

}
