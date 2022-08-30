package chapters.chapter_03;

import java.util.Scanner;

public class Q_17 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("scissor (0), rock (1), paper (2):");
		int guess = input.nextInt();
		
		int game = ((int)(Math.random() * 10)) % 3;
		
		if (guess == 0 && game == 0) System.out.println("Both of you are scissors. It is draw");
		else if (guess == 0 && game ==1) System.out.println("The computer is rock. Rock knocks scissor. You are loser");
		else if (guess == 0 && game ==2) System.out.println("The computer is paper. Scissor cuts paper. You are winner");
		else if (guess == 1 && game ==0) System.out.println("The computer is scissor. Rock knocks scissor. You are winner");
		else if (guess == 1 && game ==1) System.out.println("Both of you are rock. It is draw");
		else if (guess == 1 && game ==2) System.out.println("The computer is paper. Paper wraps rock. You are loser");
		else if (guess == 2 && game ==0) System.out.println("The computer is scissor. Scissor cuts paper. You are loser");
		else if (guess == 2 && game ==1) System.out.println("The computer is rock. Paper wraps rock. You are winner");
		else if (guess == 2 && game ==2) System.out.println("Both of you are papers. It is draw");


}
}