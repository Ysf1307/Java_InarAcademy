package chapters.chapter_06;

public class Q_27 {
    public static void main(String[] args) {

        int numberOfNumbers = 100;      //The first 100 numbers
        int numberCounter = 0;      // Number numberCounter
        int lineCounter = 0;
        int number = 1;
        int palindromeNumber = 0;
        String output = "";

        while (numberCounter < numberOfNumbers){
            number++;
            palindromeNumber = palindrome(number);
            if (isPrime(palindromeNumber) == true && isPrime(number) == true){
                output += number + " ";
                numberCounter++;
                lineCounter++;
            }
            if (lineCounter == 10) {
                output += "\n";
                lineCounter = 0;
            }
        }
        System.out.println(output);
    }
    public static int palindrome(int number) {

        String numberStr = number + "";
        String reverseNumber = "";
        int newNumber = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            reverseNumber += numberStr.charAt(numberStr.length() - 1 - i);
        }
        newNumber = Integer.parseInt(reverseNumber);
        return newNumber;
    }
    public static boolean isPrime(int number){
        boolean prime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                prime = false;
                break;
            }
            else{
                prime = true;
            }
        }
        return prime;
    }
}
