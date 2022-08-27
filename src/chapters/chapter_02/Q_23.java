package chapters.chapter_02;

import java.util.Scanner;

public class Q_23 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Distance to Drive:");
		double distance = input.nextDouble();
		
		System.out.println("Enter Full Efficiency of Car in Miles per Gallon:");
		double eff = input.nextDouble();
		
		System.out.println("Enter the Price per Gallon:");
		double price = input.nextDouble();
		
		double cost = (distance / eff) * price;
		
		
		
		
		System.out.println("Cost:" + cost);
		
		
	}

}
