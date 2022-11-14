package chapters.chapter_10;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age =age;
        this.weight = weight;
        this.height = height;
    }
    public BMI(String name, double weight, double height){
        this(name, 20, weight, height);
    }
    public BMI(String name, int age, double weight, double feet, double inches){
        this(name, age, weight);
        this.height = convertInchToMeter(feet, inches);
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    public double getBMI(){
        double bmi = weight / (Math.pow(height, 2));
        return bmi;
    }
    public double convertInchToMeter(double feet, double inches){
        inches += feet*12;
        double meters = inches*METERS_PER_INCH;
        return meters;
    }
    public String getStatus(double bmi){
        String status = "";
        bmi = getBMI();
        if (bmi < 18.5){
            status = "underweight";
        } else if (bmi < 25) {
            status = "normal";
        } else if (bmi < 30) {
            status = "overweight";
        }else status = "obese";
        return status;
    }
    public void print(){
        System.out.println("Name: " + name + "\nBMI: " + getBMI() + "\nStatus: " + getStatus(getBMI()));
    }
}
