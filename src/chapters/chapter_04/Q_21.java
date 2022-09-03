package chapters.chapter_04;

import java.util.Scanner;

public class Q_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char ch0 = '-';
		char ch1 = '-';
		char ch2 = '-';
		char ch3 = '-';
		char ch4 = '-';
		char ch5 = '-';
		char ch6 = '-';
		char ch7 = '-';
		char ch8 = '-';
		char ch9 = '-';
		char ch10 = '-';
		char dash = '-';

		System.out.println("Enter your Social Security Number:");
		String ssn = input.next();

		if (ssn.length() == 11) {
			ch0 = ssn.charAt(0);
			ch1 = ssn.charAt(1);
			ch2 = ssn.charAt(2);
			ch3 = ssn.charAt(3);
			ch4 = ssn.charAt(4);
			ch5 = ssn.charAt(5);
			ch6 = ssn.charAt(6);
			ch7 = ssn.charAt(7);
			ch8 = ssn.charAt(8);
			ch9 = ssn.charAt(9);
			ch10 = ssn.charAt(10);
		} else {
			System.out.println(ssn + " is an invalid social security number");
			System.exit(0);
		}

		if (Character.isDigit(ch0) && Character.isDigit(ch1) && Character.isDigit(ch2) && Character.isDigit(ch4)
				&& Character.isDigit(ch5) && Character.isDigit(ch7) && Character.isDigit(ch8) && Character.isDigit(ch9)
				&& Character.isDigit(ch10) && ch3 == dash && ch6 == dash)
			System.out.println(ssn + " is a valid social security number");
		else
			System.out.println(ssn + " is an invalid social security number");

	}
}