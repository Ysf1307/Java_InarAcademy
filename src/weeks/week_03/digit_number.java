package weeks.week_03;

import java.util.Scanner;

public class digit_number {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 4 digit number:");
		int sayi = input.nextInt();
		
		int first = sayi %10;
		int second = (sayi / 10) % 10;
		int third = (sayi / 100) % 10;
		int forth = sayi /1000;
		
		System.out.println("New number is " + first + "" + second + "" + third + "" + forth);

	}

}
