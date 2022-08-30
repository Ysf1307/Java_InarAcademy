package chapters.chapter_03;

import java.util.Scanner;

public class Q_12 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 3 digit number:");
		int sayi = input.nextInt();
		
		if((sayi / 100) == (sayi %10)) System.out.println(sayi + " is a palindrome number");
		else System.out.println(sayi + " is not a palindrome number");

}
}