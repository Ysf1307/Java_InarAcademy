package weeks.denemeler;

public class T1 {
    public static void main(String[] args) {
        double number = 109962.95;
        String numberStr = String.valueOf(number);
        double lastNumber = Double.parseDouble(numberStr);
        double d = 5.0 / 3.0;
        numberStr = String.format("%.2f",d);


        System.out.println(number);
        System.out.println(numberStr);
        System.out.println(lastNumber);
        System.out.println(d);
    }
}
