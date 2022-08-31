package chapters.chapter_03;

import java.util.Scanner;

public class Q_18 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Weight of your package: ");
		double weight = input.nextDouble();
		double price = 0;
		 
		if (weight <= 1 )
			price = 3.5 * weight;
		else if (weight <= 3)
			price = 5.5 * weight;
		else if (weight <= 10)
			price = 8.5 * weight;
		else if (weight <= 20)
			price = 10.5 * weight;
		else System.out.println("The package cannot be shipped");
		
		System.out.println("Shipping price of your package: " + price);
			 

}
}