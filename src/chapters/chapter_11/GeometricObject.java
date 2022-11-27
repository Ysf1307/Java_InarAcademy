package chapters.chapter_11;

public class GeometricObject {
    private String color;
    private boolean isFilled;


    public GeometricObject(){
        this("Red", true);
    }
    public GeometricObject(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String toString(){
        return "Object's color is " + getColor() + " and it is " + (isFilled() ? "filled": "not filled");
    }
}
