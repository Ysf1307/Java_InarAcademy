package chapters.chapter_04;

import java.util.Scanner;

public class Q_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius of the bounding circle:");
		double radius = input.nextDouble();

		double degree1 = 90;
		double radian1 = Math.toRadians(degree1);
		double x1 = radius * Math.cos(radian1);
		double y1 = radius * Math.sin(radian1);

		double degree2 = degree1 + 72;
		double radian2 = Math.toRadians(degree2);
		double x2 = radius * Math.cos(radian2);
		double y2 = radius * Math.sin(radian2);

		double degree3 = degree2 + 72;
		double radian3 = Math.toRadians(degree3);
		double x3 = radius * Math.cos(radian3);
		double y3 = radius * Math.sin(radian3);

		double degree4 = degree3 + 72;
		double radian4 = Math.toRadians(degree4);
		double x4 = radius * Math.cos(radian4);
		double y4 = radius * Math.sin(radian4);

		double degree5 = degree4 + 72;
		double radian5 = Math.toRadians(degree5);
		double x5 = radius * Math.cos(radian5);
		double y5 = radius * Math.sin(radian5);

		System.out.println("The coordinates of five points on the pentagon are");
		System.out.println(x1 + " " + y1);
		System.out.println(x2 + " " + y2);
		System.out.println(x3 + " " + y3);
		System.out.println(x4 + " " + y4);
		System.out.println(x5 + " " + y5);

	}
}