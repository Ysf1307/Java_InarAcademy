package chapters.chapter_02;

import java.util.Scanner;

public class Q_13 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the monthly saving");
		double saving = input.nextDouble();
		
		double first_month = saving * (1 + 0.00417);
		double second_month =(saving + first_month) * (1 + 0.00417);
		double third_month = (saving + second_month) * (1 + 0.00417);
		double forth_month = (saving + third_month) * (1 + 0.00417);
		double fifth_month = (saving + forth_month) * (1 + 0.00417);
		double sixth_month = (saving + fifth_month) * (1 + 0.00417);
		
		System.out.println(first_month);
		System.out.println(second_month);
		System.out.println(third_month);
		System.out.println(forth_month);
		System.out.println(fifth_month);
		System.out.println(sixth_month);


	}

}
