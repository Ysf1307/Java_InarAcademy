package chapters.chapter_06;

import java.util.Scanner;

public class Q_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();
        System.out.print("Enter day of month: ");
        int day = input.nextInt();

        System.out.println("Current date and time:");

        printDate(year, month, day);
        printTime();
    }

    public static void printDate(int year, int month, int day) {
        String monthName = getMonthName(month);
        System.out.println(monthName + ", " + day + " " + year);
    }

    public static void printTime() {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.printf("%02d:%02d:%02d GMT", currentHour, currentMinute, currentSecond);
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }

        return monthName;
    }
}
