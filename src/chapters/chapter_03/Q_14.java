package chapters.chapter_03;

import java.util.Scanner;

public class Q_14 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter '0' for head and '1' for tail:");
		int guess = input.nextInt();
		
		int coin = ((int)(Math.random()* 10)) % 2;
		System.out.println(coin);
		
		
		if (guess == coin) System.out.println("Correct");
		else System.out.println("Wrong");

}
}