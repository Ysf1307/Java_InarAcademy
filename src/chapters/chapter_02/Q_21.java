package chapters.chapter_02;

import java.util.Scanner;

public class Q_21 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Investment Amount:");
		double amount = input.nextDouble();
		
		System.out.println("Enter the Annual Interest Rate:");
		double int_rate = input.nextDouble();
		
		System.out.println("Enter the Number of Years:");
		int year = input.nextInt();
		
		double value = amount * Math.pow((1 + (int_rate /12)), (year * 12));
		
		System.out.println("Accumulated value is " + value);

	}
}
