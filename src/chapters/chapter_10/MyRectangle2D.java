package chapters.chapter_10;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;


    public MyRectangle2D(){
        this(0,0,1,1);
    }
    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    public boolean contains(double x, double y){
        if (x > this.x - (width / 2) && x < this.x + (width / 2)
        && y > this.y - (height / 2) && y < this.y + (height / 2)){
            return true;
        }
        else return false;
    }

    public boolean contains(MyRectangle2D r){
        if (r.x - (r.width / 2) > this.x - (width / 2) && r.x + (r.width / 2) < this.x + (width / 2)
                && r.y - (r.height / 2) > this.y - (height / 2) && r.y + (r.height / 2) < this.y + (height / 2)){
            return true;
        }
        else return false;
    }

    public boolean overlaps(MyRectangle2D r){
        if ((r.x - (r.width / 2) < this.x - (width / 2) && r.x + (r.width / 2) < this.x + (width / 2) && r.x + (r.width / 2) > this.x - (width / 2))
                || (r.y - (r.height / 2) < this.y - (height / 2) && r.y + (r.height / 2) < this.y + (height / 2) && r.y + (r.height / 2) > this.y - (height / 2))){
            return true;
        }
        else return false;
    }
}
