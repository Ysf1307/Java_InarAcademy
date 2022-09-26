package chapters.chapter_05;

import java.util.Scanner;

public class Q_28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nameOfDay = "";
        String nameOfMonth = "";
        int codeOfFirstDay = 0;
        int numberOfDayInMonth = 0;
        int day = 0;

        System.out.println("Enter the year:");
        int year = input.nextInt();

        while (true) {
            System.out.println("Enter the first day of the year('0' for Sunday):");
            day = input.nextInt();
            if (day < 7) {
                break;
            }
        }

        for (int i = 1; i <= 12; i++) {
            codeOfFirstDay = day % 7;                // Code of the first day of the current Month
            switch (codeOfFirstDay) {
                case 0:
                    nameOfDay = "Sunday";
                    break;
                case 1:
                    nameOfDay = "Monday";
                    break;
                case 2:
                    nameOfDay = "Tuesday";
                    break;
                case 3:
                    nameOfDay = "Wednesday";
                    break;
                case 4:
                    nameOfDay = "Thursday";
                    break;
                case 5:
                    nameOfDay = "Friday";
                    break;
                case 6:
                    nameOfDay = "Saturday";
                    break;
            }
            switch (i) {
                case 1:
                    nameOfMonth = "January";
                    day += 31;
                    break;
                case 2:
                    nameOfMonth = "February";
                    if (year % 4 == 0 && year % 100 != 0) {
                        day += 29;
                    } else {
                        day += 28;
                    }
                    break;
                case 3:
                    nameOfMonth = "March";
                    day += 31;
                    break;
                case 4:
                    nameOfMonth = "April";
                    day += 30;
                    break;
                case 5:
                    nameOfMonth = "May";
                    day += 31;
                    break;
                case 6:
                    nameOfMonth = "June";
                    day += 30;
                    break;
                case 7:
                    nameOfMonth = "July";
                    day += 31;
                    break;
                case 8:
                    nameOfMonth = "August";
                    day += 31;
                    break;
                case 9:
                    nameOfMonth = "September";
                    day += 30;
                    break;
                case 10:
                    nameOfMonth = "October";
                    day += 31;
                    break;
                case 11:
                    nameOfMonth = "November";
                    day += 30;
                    break;
                case 12:
                    nameOfMonth = "December";
                    day += 31;
                    break;
            }
            System.out.println(nameOfMonth + " 1, " + year + " is " + nameOfDay);
        }
    }
}
