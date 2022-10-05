package chapters.chapter_05;

import java.util.Scanner;

public class Q_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year :");
        int year = input.nextInt();
        System.out.println("First day of the year ('0' for Sunday) :");
        int codeOfDay = input.nextInt();

        String month = "";
        String dash = "-----------------------------";
        String weekdays = "Sun\tMon\tTue\tWed\tThu\tFri\tSat";
        String calender = "";
        String output = "";
        int days = 0;
        int numberOfDaysInMonth = 0;
        int count = 0;


        for (int i = 1; i <= 12; i++){
            switch (i){
                case 1:
                    month = "\t\tJanuary " + year;
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    month = "\t\tFebruary " + year;
                    if (year % 4 == 0 && year % 100 != 0){
                        numberOfDaysInMonth = 29;
                    }
                    else numberOfDaysInMonth = 28;
                    break;
                case 3:
                    month = "\t\tMarch " + year;
                    numberOfDaysInMonth = 31;
                    break;
                case 4:
                    month = "\t\tApril " + year;
                    numberOfDaysInMonth = 30;
                    break;
                case 5:
                    month = "\t\tMay " + year;
                    numberOfDaysInMonth = 31;
                    break;
                case 6:
                    month = "\t\tJune " + year;
                    numberOfDaysInMonth = 30;
                    break;
                case 7:
                    month = "\t\tJuly " + year;
                    numberOfDaysInMonth = 31;
                    break;
                case 8:
                    month = "\t\tAugust " + year;
                    numberOfDaysInMonth = 31;
                    break;
                case 9:
                    month = "\t\tSeptember " + year;
                    numberOfDaysInMonth = 30;
                    break;
                case 10:
                    month = "\t\tOctober " + year;
                    numberOfDaysInMonth = 31;
                    break;
                case 11:
                    month = "\t\tNovember " + year;
                    numberOfDaysInMonth = 30;
                    break;
                case 12:
                    month = "\t\tDecember " + year;
                    numberOfDaysInMonth = 31;
                    break;
            }

            for (int j = 0; j < codeOfDay; j++){
                calender += "\t";
            }
            for (int k = 1; k <= (7 - codeOfDay); k++){
                calender += k + "\t";
            }
            calender += "\n";
            for (int l = (7 - codeOfDay) + 1; l <= numberOfDaysInMonth; l++){
                calender += l + "\t";
                count++;
                if (count % 7 == 0){
                    calender += "\n";
                }
            }
            codeOfDay = (codeOfDay + numberOfDaysInMonth) % 7;
            output += month + "\n" + dash + "\n" + weekdays + "\n" + calender + "\n\n";
        }
        System.out.println(output);
    }
}

