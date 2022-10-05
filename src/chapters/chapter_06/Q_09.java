package chapters.chapter_06;

public class Q_09 {
    public static void main(String[] args) {

        double feet = 0;
        double meter = 0;

        System.out.println("Feet\tMeters\n-----------------");
        for (feet = 1; feet <= 10; feet++){
            meter = footToMeter(feet);
            System.out.println(feet + "\t\t" + meter);
        }

           System.out.println("\n\nFeet\t\tMeters\n-----------------");

        for (meter = 20; meter < 70; meter +=5){
            feet = meterToFoot(meter);
            System.out.println(meter + "\t\t" + feet);
        }
    }
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;
    }
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }
}
