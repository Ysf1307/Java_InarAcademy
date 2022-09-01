package chapters.chapter_04;

public class Q_06 {
	
	public static void main(String[] args) {
		
		int radius = 40;
		
		double degree1 = Math.random() * 180;
		double radian1 = Math.toRadians(degree1);
		double x1 = radius * Math.cos(radian1);
		double y1 = radius * Math.sin(radian1);
		
		double degree2 = Math.random() * 180;
		double radian2 = Math.toRadians(degree2);
		double x2 = radius * Math.cos(radian2);
		double y2 = radius * Math.sin(radian2);
		
		double degree3 = Math.random() * 180;
		double radian3 = Math.toRadians(degree3);
		double x3 = radius * Math.cos(radian3);
		double y3 = radius * Math.sin(radian3);
		
		double a = radius * Math.acos(Math.sin(x3) * Math.sin(x2) + Math.cos(x3) * Math.cos(x2) * Math.cos(y3 - y2));
		double b = radius * Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3));
		double c = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		double radian_a = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
		double radian_b = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
		double radian_c = Math.acos((c * c - b * b - a * a) / (-2 * b * a));
		
		double degree_a = Math.toDegrees(radian_a);
		double degree_b = Math.toDegrees(radian_b);
		double degree_c = Math.toDegrees(radian_c);

		
		System.out.println(degree_a);
		System.out.println(degree_b);
		System.out.println(degree_c);



		
	}

}
