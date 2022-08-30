package chapters.chapter_03;

import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Month Number between 1-12:");
		int monthNumber = input.nextInt();
		System.out.println("Enter Year:");
		int year = input.nextInt();
		int monthDays;
		
		if (monthNumber == 1) {
			monthDays = 31;
			System.out.println("January " + year + " had " + monthDays + " days");
			}
		else if(monthNumber ==3) {
			monthDays = 31;
		System.out.println("March " + year + " had " + monthDays + " days");
		}

		else if(monthNumber ==4) {
			monthDays = 30;
		System.out.println("April " + year + " had " + monthDays + " days");
		}
		else if(monthNumber ==5) {
			monthDays = 31;
		System.out.println("May " + year + " had " + monthDays + " days");
		}
		else if(monthNumber ==6) {
			monthDays = 30;
		System.out.println("June " + year + " had " + monthDays + " days");
		}
		else if(monthNumber ==7) {
			monthDays = 31;
		System.out.println("July " + year + " had " + monthDays + " days");
		}
		else if(monthNumber ==8) {
			monthDays = 31;
		System.out.println("August " + year + " had " + monthDays + " days");
		}
		else if(monthNumber ==9) {
			monthDays = 30;
		System.out.println("September " + year + " had " + monthDays + " days");
		}
		else if(monthNumber ==10) {
			monthDays = 31;
		System.out.println("October " + year + " had " + monthDays + " days");
		}
		else if(monthNumber ==11) {
			monthDays = 30;
		System.out.println("November " + year + " had " + monthDays + " days");
		}
		else if (monthNumber==12) {
				monthDays = 31;
		System.out.println("December " + year + " had " + monthDays + " days");
		}
		else if (monthNumber == 2 && year % 4 == 0)
			System.out.println("February " + year + " had 29 days" );
		else if (monthNumber == 2 && year % 4 != 0)
			System.out.println("February " + year + " had 28 days" );
		
		

}
}