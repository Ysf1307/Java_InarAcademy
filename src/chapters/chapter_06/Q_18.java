package chapters.chapter_06;

import java.util.Scanner;

public class Q_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Password:");
        String passwordForCheck = input.next();

        boolean result = checkPassword(passwordForCheck);

        if (result == true){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
    public static boolean checkPassword(String password){
        boolean length = false;
        boolean consistOfLettersAndDigits = false;
        boolean contain2Digits = false;
        boolean check = false;

        if (password.length() >= 8){
            length = true;
        }

        for (int i = 0; i < password.length(); i++) {
            if ((password.charAt(i) > 47 && password.charAt(i) < 58)
                    || (password.charAt(i) > 64 && password.charAt(i) < 91)
                    || (password.charAt(i) > 96 && password.charAt(i) < 123)){
                consistOfLettersAndDigits = true;
            }
        }

        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > 47 && password.charAt(i) < 58){
                count++;
            }
            if (count == 2){
                contain2Digits = true;
                break;
            }
        }
        if (length == true && consistOfLettersAndDigits == true && contain2Digits == true){
            check = true;
        }
        return check;
    }
}
