package chapters.chapter_02;

import java.util.Scanner;

public class Q_11 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Year:");
		int year = input.nextInt();
		
		int seconds = year * 365 * 24 * 60 * 60;
		int cur_pop=312032486;
		int birth = seconds / 7;
		int death = seconds / 13;
		int immigration = seconds / 45;
		int pop_to_be = cur_pop + birth + immigration - death;
		
		System.out.println(seconds);
		System.out.println(birth);
		System.out.println(death);
		System.out.println(immigration);
		System.out.println(pop_to_be);
		
		

	}

}
