package chapters.chapter_04;

import java.util.Scanner;

public class Q_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a year: ");
		int year = input.nextInt();

		System.out.println("Enter a month (Just first 3 letters and with the first letter in uppercase): ");
		String month = input.next();
		
		String m1 = "Jan";
		String m2 = "Feb";
		String m3 = "Mar";
		String m4 = "Apr";
		String m5 = "May";
		String m6 = "Jun";
		String m7 = "Jul";
		String m8 = "Aug";
		String m9 = "Sep";
		String m10 = "Oct";
		String m11 = "Nov";
		String m12 = "Dec";
		

		if (month.equals(m1))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.equals(m3))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.equals(m4))
			System.out.println(month + " " + year + " has 30 days");
		else if (month.equals(m5))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.equals(m6))
			System.out.println(month + " " + year + " has 30 days");
		else if (month.equals(m7))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.equals(m8))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.equals(m9))
			System.out.println(month + " " + year + " has 30 days");
		else if (month.equals(m10))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.equals(m11))
			System.out.println(month + " " + year + " has 30 days");
		else if (month.equals(m12))
			System.out.println(month + " " + year + " has 31 days");
		else if (month.equals(m2) && (year % 4) == 0)
			System.out.println(month + " " + year + " has 29 days");
		else if (month.equals(m2) && (year % 4) != 0)
			System.out.println(month + " " + year + " has 28 days");
		else
			System.out.println("Invalid Input !");

	}
}