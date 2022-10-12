package chapters.chapter_06;

import java.util.Scanner;

public class Q_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year");
        int year = input.nextInt();
        System.out.println("Enter a number for month (1-12)");
        int monthNumber = input.nextInt();

        printCalendar(monthNumber, year);
    }

    public static void printCalendar(int monthNumber, int year){
        String output = printTable(monthNumber, year) + "\n" + printBody(monthNumber, year);
        System.out.println(output);
    }
    public static String printTable(int monthNumber, int year){
        String month = "";
        String dash = "-----------------------------";
        String weekdays = "Sun\tMon\tTue\tWed\tThu\tFri\tSat";

        String table = "\t\t" + getMonthName(monthNumber) + " " + year + "\n" + dash + "\n" + weekdays;

        return table;
    }
    public static String getMonthName(int monthNumber){
        String monthName = "";
        switch (monthNumber) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
                }

        return monthName;
    }
    public static String printBody(int monthNumber, int year){
        String body = "";

        int initialDay = useZeller(monthNumber, year);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(monthNumber, year);
        int count = 0;

        for (int j = 0; j < initialDay; j++){
            body += "\t";
        }
        for (int k = 1; k <= (7 - initialDay); k++){
            body += k + "\t";
        }
        body += "\n";
        for (int l = (7 - initialDay) + 1; l <= numberOfDaysInMonth; l++){
            body += l + "\t";
            count++;
            if (count % 7 == 0){
                body += "\n";
            }
        }
        return body;
    }
    public static int useZeller(int monthNumber, int year){
        int j = year / 100;
        int k = year % 100;
        int q = 0;
        int m = monthNumber;

        int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        return h;   //Code of the first day of the month
    }
    public static int getNumberOfDaysInMonth(int monthNumber, int year){
        int days = 0;

        switch (monthNumber){
            case 1: days = 31; break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0){
                    days = 29;
                }
                else {
                    days = 28;
                }
                break;
            case 3: days = 31; break;
            case 4: days = 30; break;
            case 5: days = 31; break;
            case 6: days = 30; break;
            case 7: days = 31; break;
            case 8: days = 31; break;
            case 9: days = 30; break;
            case 10: days = 31; break;
            case 11: days = 30; break;
            case 12: days = 31;
        }
        return days;
    }
}
