package chapters.chapter_03;

import java.util.Scanner;

public class Q_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int sayi = input.nextInt();

		int five = sayi % 5;
		int six = sayi % 6;

		if (five == 0 && six == 0)
			System.out.println("Is " + sayi + " divisible by 5 and 6? True");
		else
			System.out.println("Is " + sayi + " divisible by 5 and 6? False");

		if (five == 0 || six == 0)
			System.out.println("Is " + sayi + " divisible by 5 or 6? True");
		else
			System.out.println("Is " + sayi + " divisible by 5 or 6? False");

		if (five == 0 ^ six == 0)
			System.out.println("Is " + sayi + " divisible by 5 or 6 but not both? True");
		else
			System.out.println("Is " + sayi + " divisible by 5 or 6 but not both? False");

	}
}