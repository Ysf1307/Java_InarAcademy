package weeks.week_03;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your year of service:");
		int year = input.nextInt();

		System.out.println("Enter your current salary:");
		double salary = input.nextDouble();

		if (year >= 5) {

			salary = salary * 1.05;
		}

		System.out.println("Your new salary is " + salary);
	}
}
