package chapters.chapter_04;

import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal value (0 to 15):");
		int decimal = input.nextInt();
		
		System.out.println("The hex value is " + Integer.toHexString(decimal));

}
}