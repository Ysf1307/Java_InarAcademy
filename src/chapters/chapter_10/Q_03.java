package chapters.chapter_10;

public class Q_03 {
    public static void main(String[] args) {

        MyInteger number = new MyInteger(17);
        char[] arr = {'3', '5', '7'};
        String str = "35";

        System.out.println("The number is " + number.getValue());
        System.out.println("Is number prime? > " + number.isPrime());
        System.out.println("Is number odd? > " + number.isOdd());
        System.out.println("Is number even? > " + number.isEven());
        System.out.println("Is number " + number.getValue() + " equals with 17 ? > " + number.equals(17));
        System.out.println("Is number " + number.getValue() + " equals with 17 ? > " + number.equals(17));
        System.out.println("Sum of char array " + MyInteger.parseInt(arr));
        System.out.println("The string number 35 is " + MyInteger.parseInt(str));
    }
}
