package chapters.chapter_04;

import java.util.Scanner;

public class Q_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a hex digit: ");
		String hexString = input.nextLine();

		char ch = hexString.charAt(0);
		if (ch <= 'F' && ch >= 'A') {
			int value = ch - 'A' + 10;
			String binary = Integer.toBinaryString(value);
			System.out.println("The decimal value for hex digit " + ch + " is " + binary);
		} else if (Character.isDigit(ch)) {
			System.out.println("The decimal value for hex digit " + ch + " is " + ch);
		} else {
			System.out.println(ch + " is an invalid input");
		}
	}
}