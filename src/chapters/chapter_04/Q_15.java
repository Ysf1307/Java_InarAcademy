package chapters.chapter_04;

import java.util.Scanner;

public class Q_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter:");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		int number;

		if (ch == 'A' || ch == 'a' || ch == 'B' || ch == 'b' || ch == 'C' || ch == 'c')
			System.out.println("The corresponding number is 2");
		else if (ch == 'D' || ch == 'E' || ch == 'F' || ch == 'd' || ch == 'e' || ch == 'f')
			System.out.println("The corresponding number is 3");
		else if (ch == 'G' || ch == 'H' || ch == 'I' || ch == 'g' || ch == 'h' || ch == 'i')
			System.out.println("The corresponding number is 4");
		else if (ch == 'J' || ch == 'K' || ch == 'L' || ch == 'j' || ch == 'k' || ch == 'l')
			System.out.println("The corresponding number is 5");
		else if (ch == 'M' || ch == 'N' || ch == 'O' || ch == 'm' || ch == 'n' || ch == 'o')
			System.out.println("The corresponding number is 6");
		else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's')
			System.out.println("The corresponding number is 7");
		else if (ch == 'T' || ch == 'U' || ch == 'V' || ch == 't' || ch == 'u' || ch == 'v')
			System.out.println("The corresponding number is 8");
		else if (ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z')
			System.out.println("The corresponding number is 9");
		else
			System.out.println(ch + " is an invalid input");

	}
}