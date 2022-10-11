package chapters.chapter_06;

public class Q_26 {
    public static void main(String[] args) {

        int numberOfNumbers = 100;      //The first 100 numbers
        int numberCounter = 0;      // Number numberCounter
        int lineCounter = 0;
        int number = 2;
        String numberStr = number + "";
        String output = "";

        while (numberCounter < numberOfNumbers){
            numberStr = number + "";

            if (isPalindrome(numberStr) == true && isPrime(number) == true){
                output += number + " ";
                numberCounter++;
                lineCounter++;
            }
            number++;

            if (lineCounter == 10){
                output += "\n";
                lineCounter = 0;
            }
        }
        System.out.println(output);

    }
    public static boolean isPalindrome (String numberStr){

        boolean palindrome = false;
        String reverse = "";

        for (int i = 0; i < numberStr.length(); i++) {
            reverse += numberStr.charAt(numberStr.length() - 1 - i);
            if (numberStr.equals(reverse)){
                palindrome = true;
            }
        }
        return palindrome;
    }
    public static boolean isPrime (int number){

        boolean prime = false;

        for (int i = 2; i < number/2; i++) {
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
