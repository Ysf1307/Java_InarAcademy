package weeks.week_14;

public class Car {
    protected String type;
    protected double horsePower;
    protected int numberOfDoors;
    protected String color;
    protected int year;
    protected boolean isAutomatic;

    public Car(){
        this("Sedan", 150, 5, "Black", 2019, true);
    }
    public Car(String type, double horsePower, int numberOfDoors, String color, int year, boolean isAutomatic){
        this.type = type;
        this.horsePower = horsePower;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
        this.year = year;
        this.isAutomatic = isAutomatic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
}
