package chapters.chapter_03;

import java.util.Scanner;

public class Q_30 {

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
		long currenthour24 = (totalhours % 24);
		long currenthour12 = (currenthour24 % 12 + offset);

		if (currenthour12 < 0)
			currenthour12 = currenthour12 * (-1);

		if (currenthour24 / 12 == 0)
			System.out.println("Current Time: " + currenthour12 + ":" + currentMinute + ":" + currentSecond + "AM");
		else
			System.out.println("Current Time: " + currenthour12 + ":" + currentMinute + ":" + currentSecond + "PM");

	}
}
