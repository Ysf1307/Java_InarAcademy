package chapters.chapter_02;

import java.util.Scanner;

public class Q_08 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the time zone offset to GMT:");
		int offset = input.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalhours = totalMinutes / 60;
		long currenthour = (totalhours % 24) + offset;
		
		System.out.println("Current Time: " + currenthour + ":" + currentMinute + ":" + currentSecond );
		
		
		
	}
}
