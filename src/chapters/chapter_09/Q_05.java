package chapters.chapter_09;

import java.util.GregorianCalendar;

public class Q_05 {
    public static void main(String[] args) {

        GregorianCalendar calendar1 = new GregorianCalendar();
        GregorianCalendar calendar2 = new GregorianCalendar();

        System.out.println("Current year: " + calendar1.YEAR);
        System.out.println("Current month: " + calendar1.MONTH);
        System.out.println("Current day of month: " + calendar1.DAY_OF_MONTH);
        System.out.println("----------------------");

        calendar2.setTimeInMillis(1234567898765L);

        System.out.println("Specified year: " + calendar2.get(GregorianCalendar.YEAR));
        System.out.println("Specified month: " + calendar2.get(GregorianCalendar.MONTH));
        System.out.println("Specified day of month: " + calendar2.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
