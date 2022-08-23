package chapters.chapter_01;

public class Q_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double time_in_seconds = 35 + (40*60) + (60*60);
		System.out.println(time_in_seconds);
		double mph = (60*60*24)/time_in_seconds;
		System.out.println(mph);
		double kmh = mph*1.6;
		System.out.println(kmh);

	}

}
