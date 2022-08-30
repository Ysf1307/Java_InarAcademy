package chapters.chapter_03;

import java.util.Scanner;

public class Q_05 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter today's day: ");
		int currentDay = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int elapse = input.nextInt();
		int futureDay = (currentDay + elapse) % 7;
		
		if (currentDay == 0)
			System.out.print("Today is Sunday ");
		else if (currentDay == 1)
			System.out.print("Today is Monday ");
		else if (currentDay == 2)
			System.out.print("Today is Tuesday ");
		else if (currentDay == 3)
			System.out.print("Today is Wednesday ");
		else if (currentDay == 4)
			System.out.print("Today is Thursday ");
		else if (currentDay == 5)
			System.out.print("Today is Friday ");
		else
			System.out.print("Today is Saturday ");
		
		if (futureDay == 0)
			System.out.println("and the future day is Sunday");
		else if (futureDay == 1)
			System.out.println("and the future day is Monday");
		else if (futureDay == 2)
			System.out.println("and the future day is Tuesday");
		else if (futureDay == 3)
			System.out.println("and the future day is Wednesday");
		else if (futureDay == 4)
			System.out.println("and the future day is Thursday");
		else if (futureDay == 5)
			System.out.println("and the future day is Friday");
		else
			System.out.println("and the future day is Saturday");
		
	}

}
