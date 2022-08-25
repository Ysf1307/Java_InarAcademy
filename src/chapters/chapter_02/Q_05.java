package chapters.chapter_02;

import java.util.Scanner;

public class Q_05 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter subtotal: ");
		double subtotal = input.nextDouble();
		
		System.out.println("Enter gratuity rate: ");
		double gratuity_rate = input.nextDouble();
		
		double gratuity = gratuity_rate * subtotal / 100;
		double total = subtotal + gratuity;
		
		System.out.println("Gratuity : " + gratuity);
		System.out.println("Total: " + total);
		

		
	}

}
