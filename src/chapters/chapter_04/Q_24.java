package chapters.chapter_04;

import java.util.Scanner;

public class Q_24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first city");
		String city1 = input.next();
		System.out.println("Enter the second city");
		String city2 = input.next();
		System.out.println("Enter the third city");
		String city3 = input.next();

		char ch1 = city1.charAt(0);
		char ch2 = city2.charAt(0);
		char ch3 = city3.charAt(0);

		int letter1 = (int) ch1;
		int letter2 = (int) ch2;
		int letter3 = (int) ch3;

		if (letter1 < letter2 && letter1 < letter3 && letter2 < letter3)
			System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
		else if (letter2 < letter1 && letter2 < letter3 && letter1 < letter3)
			System.out.println("The three cities in alphabetical order are " + city2 + " " + city1 + " " + city3);
		else if (letter3 < letter1 && letter3 < letter2 && letter1 < letter2)
			System.out.println("The three cities in alphabetical order are " + city3 + " " + city1 + " " + city2);
		else if (letter1 < letter2 && letter1 < letter3 && letter3 < letter2)
			System.out.println("The three cities in alphabetical order are " + city1 + " " + city3 + " " + city2);
		else if (letter2 < letter1 && letter2 < letter3 && letter3 < letter1)
			System.out.println("The three cities in alphabetical order are " + city2 + " " + city3 + " " + city1);
		else if (letter3 < letter1 && letter3 < letter2 && letter2 < letter1)
			System.out.println("The three cities in alphabetical order are " + city3 + " " + city2 + " " + city1);

	}
}