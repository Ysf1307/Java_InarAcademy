package chapters.chapter_01;

public class Q_11 {
	
	public static void main(String[] args) {
		
		double cur_pop=312032486.0;
		
		double birth_per_5_years = (60.0/7)*60*24*365;
		double death_per_5_years = (60.0/13)*60*24*365;
		double immigrant_per_5_years = (60.0/45)*60*24*365;
		double final_pop = cur_pop + birth_per_5_years + immigrant_per_5_years - death_per_5_years;
		
		
		System.out.println("Birth per 5 years is " + birth_per_5_years);
		System.out.println("Death per 5 years is " + death_per_5_years);
		System.out.println("Immigrant per 5 years is " + immigrant_per_5_years);
		System.out.println("Population after 5 years is " + final_pop);
	}

}
