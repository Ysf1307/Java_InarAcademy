package chapters.chapter_02;

import java.util.Scanner;

public class Q_06 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000:");
		int sayi = input.nextInt();
		
		int first_number = sayi % 10;
		int second_number = (sayi / 10) % 10;
		int third_number = sayi / 100;
		int summation = first_number + second_number + third_number;
		
		System.out.println("1. number: " + first_number);
		System.out.println("2. number: " + second_number);
		System.out.println("3. number: " + third_number);
		System.out.println("Summation: " + summation);


	}

}
