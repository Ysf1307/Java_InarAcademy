package chapters.chapter_04;

import java.util.Scanner;

public class Q_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 9 digits of an ISBN:");
		String isbn = input.next();
		
		char ch1 = isbn.charAt(0);
		int n1 = (int)ch1 - 48;
		char ch2 = isbn.charAt(1);
		int n2 = (int)ch2 - 48;
		char ch3 = isbn.charAt(2);
		int n3 = (int)ch3 - 48;
		char ch4 = isbn.charAt(3);
		int n4 = (int)ch4 - 48;
		char ch5 = isbn.charAt(4);
		int n5 = (int)ch5 - 48;
		char ch6 = isbn.charAt(5);
		int n6 = (int)ch6 - 48;
		char ch7 = isbn.charAt(6);
		int n7 = (int)ch7 - 48;
		char ch8 = isbn.charAt(7);
		int n8 = (int)ch8 - 48;
		char ch9 = isbn.charAt(8);
		int n9 = (int)ch9 - 48;
		
		int n10 = (n1 * 1 + n2 * 2 + n3 * 3 + n4 * 4 + n5 * 5 + n6 * 6 + n7 * 7 + n8 * 8 + n9 * 9) % 11;
		
		System.out.println(n1);
		
		if (n10 == 10)
			System.out.println("The last digit is 'X'");
		else System.out.println("The last digit is " + n10);
				
}
}