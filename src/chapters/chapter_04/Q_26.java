package chapters.chapter_04;

import java.util.Scanner;

public class Q_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount:");
		String amount = input.next();
		
		String dollar = amount.substring(0, 2);
		int point = amount.indexOf(',');
		String cent = amount.substring(point + 1);
		
		System.out.println(dollar + " dollars " + cent + " cents ");

}
}