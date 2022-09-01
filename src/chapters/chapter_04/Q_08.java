package chapters.chapter_04;

import java.util.Scanner;

public class Q_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an ASCII code between 0 and 127:");
		int code = input.nextInt();
		
		char ch = (char)code;
		
		System.out.println(ch);

}
}