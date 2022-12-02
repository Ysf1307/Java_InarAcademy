package chapters.chapter_12;

import chapters.chapter_11.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;


    public Triangle() throws IllegalTriangelException{
        this(1,1,1);
    }
    public Triangle(double side1, double side2, double side3) throws IllegalTriangelException{
        setSides(side1,side2,side3);
    }


    public double getSide1() {
        return side1;
    }


    public double getSide2() {
        return side2;
    }


    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setSides(double side1, double side2, double side3) throws IllegalTriangelException {
        if (side1 + side2 < side3) {
            throw new IllegalTriangelException(side1, side2, side3);
        } else if (side2 + side3 < side1) {
            throw new IllegalTriangelException(side1, side2, side3);
        } else if (side1 + side3 < side2) {
            throw new IllegalTriangelException(side1, side2, side3);
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;

        }
    }

    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(( s * (s-side1) * (s-side2) * (s-side3)), 0.5);
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }


}
