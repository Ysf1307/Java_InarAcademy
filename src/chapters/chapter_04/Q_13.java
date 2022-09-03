package chapters.chapter_04;

import java.util.Scanner;

public class Q_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter:");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		
		if(ch == 'A' || ch == 'E' || ch =='I' || ch == 'O' || ch == 'U' 
				|| ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u')
			System.out.println(ch + " is vowel");
		else System.out.println(ch + " is consonant");

}
}