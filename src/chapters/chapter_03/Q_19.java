package chapters.chapter_03;

import java.util.Scanner;

public class Q_19 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 edges of triangle:");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		
		if (edge1 < edge2 + edge3 && edge2 < edge1 + edge3 && edge3 < edge1 + edge2)
			System.out.println("Perimeter of the triangle is " + (edge1 + edge2 + edge3));
		else System.out.println("The input is invalid");


}
}