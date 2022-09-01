package chapters.chapter_04;

import java.util.Scanner;

public class Q_09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		String a = input.next();
		char ch = a.charAt(0);
		
		int code = (int)ch;
		
		System.out.println("The Unicode for the character " + ch + " is " + code);

}
}