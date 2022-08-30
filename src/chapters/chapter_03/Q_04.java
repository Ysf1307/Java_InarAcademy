package chapters.chapter_03;

public class Q_04 {
	
	public static void main(String[] args) {
		
		int number = (int)(Math.random()*100);
		int monthNumber = number % 12;
		System.out.print("Month Number is " + monthNumber + " and month is ");
		
		if(monthNumber == 1)
			System.out.print("January");
		else if (monthNumber == 2)
			System.out.print("February");
		else if (monthNumber == 3)
			System.out.print("March");
		else if (monthNumber == 4)
			System.out.print("April");
		else if (monthNumber == 5)
			System.out.print("May");
		else if (monthNumber == 6)
			System.out.print("June");
		else if (monthNumber == 7)
			System.out.print("July");
		else if (monthNumber == 8)
			System.out.print("August");
		else if (monthNumber == 9)
			System.out.print("September");
		else if (monthNumber == 10)
			System.out.print("October");
		else if (monthNumber == 11)
			System.out.print("November");
		else
			System.out.print("December");
	}

}
