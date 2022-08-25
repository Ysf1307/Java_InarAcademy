package chapters.chapter_02;

import java.util.Scanner;

public class Q_14 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight:");
		double weight = input.nextDouble();
		System.out.println("Enter your height");
		double height = input.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println(bmi);
	}

}
