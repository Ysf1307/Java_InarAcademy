package chapters.chapter_02;

import java.util.Scanner;

public class Q_01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Fahrenheit'a çevrilmesini istediğiniz sıcaklık derecesini Celsius cinsinden giriniz: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		System.out.println(celsius + " celsius derece " + fahrenheit + "fahrenheit derecedir.");
		
		
	}

}
