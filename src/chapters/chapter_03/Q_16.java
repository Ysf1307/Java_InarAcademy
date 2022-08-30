package chapters.chapter_03;

public class Q_16 {
	
	public static void main(String[] args) {
		
		int operator;
		int a = (int)(Math.random() * 10);
		if (a / 2 == 0) operator = 1;
		else operator =-1;
		double x = (Math.random() * 100 * operator) % 50;
		
		a = (int)(Math.random() * 10);
		if (a / 2 == 0) operator = 1;
		else operator =-1;
		double y = Math.random() * 100 * operator;
		
		System.out.println(x);
		System.out.println(y);

		
	}

}
