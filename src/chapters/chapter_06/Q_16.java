package chapters.chapter_06;

public class Q_16 {
    public static void main(String[] args) {

        int year1 = 2000;
        int year2 = 2020;
        int numberOfDays = 0;

        System.out.println("Year\tNumber of Days");

        for (int i = year1; i <= year2 ; i++) {
            System.out.println(i + "\t" + numberOfDaysInAYear(i));
        }
    }
    public static int numberOfDaysInAYear(int year){
        int numberOfDays = 0;

        if (year % 4 == 0 && year % 100 != 0){
            numberOfDays = 366;
        }
        else {
            numberOfDays = 365;
        }
        return numberOfDays;
    }
}
