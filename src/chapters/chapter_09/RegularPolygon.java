package chapters.chapter_09;

public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    RegularPolygon(){
    }
    RegularPolygon(int numberOfSides, double lengthOfSide){
        n = numberOfSides;
        side = lengthOfSide;
    }
    RegularPolygon(int numberOfSides, double lengthOfSide, double newX, double newY){
        n = numberOfSides;
        side = lengthOfSide;
        x = newX;
        y = newY;
    }

    public int getN(){
        return n;
    }
    public double getSide(){
        return side;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getPerimeter(){
        return n * side;
    }
    public double getArea(){
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
    public void printPolygon(){
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
}
