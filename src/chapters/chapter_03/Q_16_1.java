package chapters.chapter_03;

public class Q_16_1 {

	public static void main(String[] args) {

		int a1 = 50;
		int a2 = -50;
		int a3 = 100;
		int a4 = -100;
		int b = (int) ((Math.random() * 100) % 4);
		int c = 0;
		int operator;
		double x = 0;
		double y = 0;

		if (b == 0) {
			c = (int) (Math.random() * 10);
			if (c / 2 == 0)
				operator = 1;
			else
				operator = -1;
			
			x = a1;
			y = Math.random() * 100;
		}
		
		else if (b == 1) {
			c = (int) (Math.random() * 10);
			if (c / 2 == 0)
				operator = 1;
			else
				operator = -1;
			
			x = a2;
			y = Math.random() * 100;
		}
		
		else if (b == 2) {
			c = (int) (Math.random() * 10);
			if (c / 2 == 0)
				operator = 1;
			else
				operator = -1;
			
			x = (Math.random() * 100) % 50;
			y = a3;
		}
		
		else if (b == 3) {
			c = (int) (Math.random() * 10);
			if (c / 2 == 0)
				operator = 1;
			else
				operator = -1;
			
			x = (Math.random() * 100) % 50;
			y = a4;
		}
		
		System.out.println(x + " " + y);
	}

}
