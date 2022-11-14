package weeks.week_14;

public class Student {
    protected String name;
    protected int age;
    protected String gender;
    protected double height;
    protected double weight;
    protected boolean isTurk = true;

    public Student(){
        this("Ali", 15, "male", 1.75, 70, true);
    }
    public Student(String name, int age, String gender, double height, double weight, boolean isTurk){
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.isTurk = isTurk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isTurk() {
        return isTurk;
    }

    public void setTurk(boolean turk) {
        isTurk = turk;
    }
    public double getBMI(){
        double bmi = getWeight() / (Math.pow(getHeight(), 2));
        return bmi;
    }
    public String getBMIStatus(double bmi){
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

    @Override
    public String toString(){
        String output = "Name: " + getName() + "\nAge: " + getAge() + "\nGender: " + getGender() + "\nHeight: " + getHeight()
                + "\nWeight: " + getWeight() + "\nisTurk: " + isTurk() + "\nWeight Status: " + getBMIStatus(getBMI());
        return output;
    }
}
