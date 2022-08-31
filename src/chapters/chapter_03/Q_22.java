package chapters.chapter_03;

import java.util.Scanner;

public class Q_22 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter points x and y:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double range = Math.pow((Math.pow((x-0), 2) + Math.pow((y-0), 2)), 0.5);
		
		if (range <= 10) System.out.println("Point ( " + x + ", " + y + " ) is in the circle");
		else System.out.println("Point ( " + x + ", " + y + " ) is not in the circle");
		
		

}
}