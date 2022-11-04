package chapters.chapter_09;

public class Fan {
    int speedOfFan = 1;
    boolean turnOn = false;
    double radius = 5;
    String color = "Blue";

    Fan(){
    }
    Fan(boolean newTurnOn, int newSpeedOfFan, double newRadius, String newColor){
        turnOn = newTurnOn;
        speedOfFan = newSpeedOfFan;
        radius = newRadius;
        color = newColor;
    }

    public int getSpeedOfFan(){
        return speedOfFan;
    }
    public boolean isTurnOn(){
        return turnOn;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void printFan(){
        String output = "";
        String speedLevel = "";
        switch (getSpeedOfFan()){
            case 1: speedLevel = "Slow";
            break;
            case 2: speedLevel = "Medium";
            break;
            case 3: speedLevel = "High";
        }

        if (turnOn){
            output += "The fan speed is " + getSpeedOfFan() + " and it is " + speedLevel;
            output += "\nThe color of fan is " + getColor();
            output += "\nThe radius is " + getRadius();
            System.out.println(output);
        }
        else {
            output += "The color of fan is " + getColor();
            output += "\nThe radius is " + getRadius();
            System.out.println(output);
        }
    }
}
