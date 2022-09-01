package chapters.chapter_04;

public class Q_03 {
	
	public static void main(String[] args) {
		
		double atlanta_x = 33.73;
		double atlanta_y = -84.46;
		double orlando_x = 28.56;
		double orlando_y = -81.39;
		double savannah_x = 32.07;
		double savannah_y = -81.17;
		double charlotte_x = 35.18;
		double charlotte_y = -80.84;
		double radius = 6371.01;
		
		double distance_A_C = (radius * Math.acos(Math.sin(atlanta_x) * Math.sin(charlotte_x) 
				+ Math.cos(atlanta_x) * Math.cos(charlotte_x) * Math.cos(atlanta_y - charlotte_y))) / 1000;
		
		double distance_C_S = (radius * Math.acos(Math.sin(charlotte_x) * Math.sin(savannah_x) 
				+ Math.cos(charlotte_x) * Math.cos(savannah_x) * Math.cos(charlotte_y - savannah_y))) / 1000;
		
		double distance_S_O = (radius * Math.acos(Math.sin(savannah_x) * Math.sin(orlando_x) 
				+ Math.cos(savannah_x) * Math.cos(orlando_x) * Math.cos(savannah_y - orlando_y))) / 1000;
		
		double distance_O_A = (radius * Math.acos(Math.sin(orlando_x) * Math.sin(atlanta_x) 
				+ Math.cos(orlando_x) * Math.cos(atlanta_x) * Math.cos(orlando_y - atlanta_y))) / 1000;
		
		double distance_A_S = (radius * Math.acos(Math.sin(atlanta_x) * Math.sin(savannah_x) 
				+ Math.cos(atlanta_x) * Math.cos(savannah_x) * Math.cos(atlanta_y - savannah_y))) / 1000;
		
		
		double s1 = (distance_A_S + distance_S_O + distance_O_A) / 2;
		double area1 = Math.sqrt(s1 * (s1 - distance_A_S) * (s1 - distance_S_O) * (s1 - distance_O_A));
		
		double s2 = (distance_A_C + distance_C_S + distance_A_S) / 2;
		double area2 = Math.sqrt(s2 * (s2 - distance_A_C) * (s2 - distance_C_S) * (s2 - distance_A_S));
		
		double area = area1 + area2;
		
		System.out.println("Distance between Atlanta and Charlotte is " + distance_A_C + " km");
		System.out.println("Distance between Charlotte and Savannah is " + distance_C_S + " km");
		System.out.println("Distance between Savannah and Orlando is " + distance_S_O + " km");
		System.out.println("Distance between Orlando and Atlanta is " + distance_O_A + " km");
		System.out.println("Distance between Atlanta and Savannah is " + distance_A_S + " km");
		System.out.println(" ");
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(" ");

		System.out.println("The area between cities is " + area + " square kilometer");

		
	
	}

}
