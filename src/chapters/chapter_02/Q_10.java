package chapters.chapter_02;

import java.util.Scanner;

public class Q_10 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Initial Temperature:");
		double t_1 = input.nextDouble();
		
		System.out.println("Enter the Desired Temperature:");
		double t_2 = input.nextDouble();

		System.out.println("Enter the Mass in Kilogram:");
		double mass = input.nextDouble();
		
		double energy = mass * (t_2 - t_1) * 4184;
		System.out.println(energy);

	}

}
