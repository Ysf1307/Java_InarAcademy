package chapters.chapter_03;

import java.util.Scanner;

public class Q_08 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		int sayi1 = input.nextInt();
		int sayi2 = input.nextInt();
		int sayi3 = input.nextInt();
		
		if (sayi1 > sayi2 && sayi1 > sayi3 && sayi2 > sayi3)
			System.out.println("Your numbers in non-decreasing order: " + sayi1 + " > " + sayi2 + " > " + sayi3);
		else if (sayi1 > sayi2 && sayi1 > sayi3 && sayi3 > sayi2)
			System.out.println("Your numbers in non-decreasing order: " + sayi1 + " > " + sayi3 + " > " + sayi2);
		else if (sayi2 > sayi1 && sayi2 > sayi3 && sayi1 > sayi3)
			System.out.println("Your numbers in non-decreasing order: " + sayi2 + " > " + sayi1 + " > " + sayi3);
		else if (sayi2 > sayi1 && sayi2 > sayi3 && sayi3 > sayi1)
			System.out.println("Your numbers in non-decreasing order: " + sayi2 + " > " + sayi3 + " > " + sayi1);
		else if (sayi3 > sayi2 && sayi3 > sayi1 && sayi1 > sayi2)
			System.out.println("Your numbers in non-decreasing order: " + sayi3 + " > " + sayi1 + " > " + sayi2);
		else 
			System.out.println("Your numbers in non-decreasing order: " + sayi3 + " > " + sayi2 + " > " + sayi1);

		

}
}