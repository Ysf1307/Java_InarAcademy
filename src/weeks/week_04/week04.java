package weeks.week_04;

public class week04 {
	
	public static void main(String[] args) {
		
		trim();
		
		
	}

	public static void substring() {
		
		String temp = "Inar Academy";
		String yeni = temp.substring(3,8);
		System.out.println(temp);
		System.out.println(yeni);
	}
	
	
	public static void length() {

		String temp = "I love Inar Academy";
		
		int length = temp.length();
		
		System.out.println(length);
	}
	public static void equalsIgnoreCase() {
		
		String word1 = "Inar";
		String word2 = "inAr";
		System.out.println(word1.equalsIgnoreCase(word2));
	}
	
	public static void contains() {
		
		String wordOne = "Academy";
		String wordTwo = "demy";
		System.out.println(wordOne.contains(wordTwo));
	}
	
	public static void trim() {
		
		String str = "\n Inar \n Academy \t ";
		String str1 = str.trim();
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.trim());
	}
	
	public  static void charAt() {
		String str = "Inar Academy";
		char ch = str.charAt(6);
		System.out.println(ch);
	}
	public static void toLowerCase() {
		
		String str = "InAr AcAdemY";
		String str1= str.toLowerCase();
		System.out.println(str1);
	}
	
	public static void toUpperCase() {
		
		String str = "InAr AcAdemY";
		String str1= str.toUpperCase();
		System.out.println(str1); 
	}

}
