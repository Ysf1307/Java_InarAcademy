package weeks.week_03;

import java.util.Scanner;

public class oldest_age {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st Age:");
		int age_1 = input.nextInt();
		
		System.out.println("Enter 2nd Age:");
		int age_2 = input.nextInt();
		
		System.out.println("Enter 3rd Age:");
		int age_3 = input.nextInt();
		
		if (age_1 > age_2 && age_1 > age_3)
			System.out.println("The oldest age is " + age_1);
		else if (age_2 > age_1 && age_2 > age_3)
			System.out.println("The oldest age is " + age_2);
		else
			System.out.println("The oldest age is " + age_3);
	}

}
