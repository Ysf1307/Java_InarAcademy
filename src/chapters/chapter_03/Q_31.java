package chapters.chapter_03;

import java.util.Scanner;

public class Q_31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from dollars to RMB:");
		double rate = input.nextDouble();
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
		int convert = input.nextInt();
		
		if (convert == 0) {
			System.out.println("Enter the dollar amount:");
			double usd = input.nextDouble();
			double rmb = usd * rate;
			System.out.println(usd + " USD is " + rmb + "YUAN");
		}
		else if (convert == 1){
			System.out.println("Enter the RMB amount:");
			double rmb = input.nextDouble();
			double usd = rmb / rate;
			System.out.println(rmb + " YUAN is " + usd + "U.S Dollars");
		}
		else System.out.println("Incorrect input");
		

}
}