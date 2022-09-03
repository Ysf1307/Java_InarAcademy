package chapters.chapter_04;

import java.util.Scanner;

public class Q_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter two characters: ");
		String characters = input.next();
		char ch1 = characters.charAt(0);
		char ch2 = characters.charAt(1);
		String major = "Invalid Input";
		String status = "Invalid Input";

		if (ch1 == 'M')
			major = "Mathematics";
		else if (ch1 == 'C')
			major = "Computer Science";
		else if (ch1 == 'I')
			major = "Information Technology";
		else System.out.println("Invalid Major Input");
		
		if (ch2 == '1')
			status = "Freshman";
		else if (ch2 == '2')
			status = "Sophomore";
		else if (ch2 == '3')
			status = "Junior";
		else if (ch2 == '4')
			status = "Senior";
		else System.out.println("Invalid Status Input");
		
		System.out.println(major + " " + status );
			

	}
}