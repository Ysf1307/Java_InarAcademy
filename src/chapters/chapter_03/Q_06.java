package chapters.chapter_03;

import java.util.Scanner;

public class Q_06 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble();
		System.out.println("Enter feet:");
		double heightInFeets = input.nextDouble();
		System.out.println("Enter inches:");
		double heightInInchs = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		final double METERS_PER_FEET = 0.3048;
		
		double weightInKilograms = weight * KILOGRAMS_PER_POUND; 
		double heightInMeters = (heightInInchs * METERS_PER_INCH) + (heightInFeets * METERS_PER_FEET); 
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		System.out.println("Your BMI is " + bmi);
		
		if(bmi < 18.5)
			System.out.println("Underweight");
		else if(bmi < 25)
			System.out.println("Normal");
		else if(bmi < 30)
			System.out.println("Overweight");
		else 
			System.out.println("Obese");
	}

}
