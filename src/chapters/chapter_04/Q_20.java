package chapters.chapter_04;

import java.util.Scanner;

public class Q_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string message:");
		String message = input.next();
		
		int length = message.length();
		char firstLetter = message.charAt(0);
		
		System.out.println("Length of the message is " + length);
		System.out.println("The first letter is " + firstLetter);
}
}