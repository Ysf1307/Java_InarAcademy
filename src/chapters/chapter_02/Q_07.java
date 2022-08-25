package chapters.chapter_02;

import java.util.Scanner;

public class Q_07 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a HUGE number for minute:");
		int minute = input.nextInt();
		
		int day = (minute / 60) / 24;
		int year = day / 365;
		
		System.out.println("Number of Days: " + day);
		System.out.println("Number of Years: " + year);
	}

}
