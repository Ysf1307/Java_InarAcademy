package chapters.chapter_02;

import java.util.Scanner;

public class Q_20 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the balance:");
		double balance = input.nextDouble();
		
		System.out.println("Enter the Annual Percentage Interest Rate:");
		double rate = input.nextDouble();
		
		double interest = balance * (rate / 1200);
		
		System.out.println(interest);
		
	}

}
