package chapters.chapter_04;

import java.util.Scanner;

public class Q_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter grade: ");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		
		if(ch == 'A') System.out.println("The numeric value for grade " + ch + " is 4");
		else if(ch == 'B') System.out.println("The numeric value for grade " + ch + " is 3");
		else if(ch == 'C') System.out.println("The numeric value for grade " + ch + " is 2");
		else if(ch == 'D') System.out.println("The numeric value for grade " + ch + " is 1");
		else if(ch == 'F') System.out.println("The numeric value for grade " + ch + " is 0");
		else System.out.println("The numeric value for grade " + ch + " is invalid");



}
}