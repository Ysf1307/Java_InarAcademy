package chapters.chapter_06;

public class Q_33 {
    public static void main(String[] args) {
        System.out.println(getCurrentDate() + "\n" + getCurrentHour());
    }

    public static String getCurrentHour() {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        String hour = String.format("%02d:%02d:%02d GMT", currentHour, currentMinute, currentSecond);

        return hour;
    }
    public static String getCurrentDate(){
        String date = getMonthName(getYear()) + " " + getDayOfMonth(getYear()) + ", " + getYear();
        return date;
    }

    public static int getDayOfMonth(int year) {
        int day = getDayOfCurrentYear();

        for (int month = 1; month <= 12; month++) {
            if (month == 1 && day > 31){
                day -= 31;
            }
            if (month == 2 && year % 4 == 0 && year % 100 != 0 && day > 29){
                day -= 29;
            }
            if (month == 2 && (year % 4 != 0 || year % 100 == 0) && day > 28){
                day -= 28;
            }
            if (month == 3 && day > 31){
                day -= 31;
            }
            if (month == 4 && day > 30){
                day -= 30;
            }
            if (month == 5 && day > 31){
                day -= 31;
            }
            if (month == 6 && day > 30){
                day -= 30;
            }
            if (month == 7 && day > 31){
                day -= 31;
            }
            if (month == 8 && day > 31){
                day -= 31;
            }
            if (month == 9 && day > 30){
                day -= 30;
            }
            if (month == 10 && day > 31){
                day -= 31;
            }
            if (month == 11 && day > 30){
                day -= 30;
            }
            if (month == 12 && day > 31){
                day -= 31;
            }
        }
        return day;
    }

    public static String getMonthName(int year) {
        String monthName = "";
        int day = getDayOfCurrentYear();

        for (int month = 1; month <= 12; month++) {
            if (month == 1){
                if (day > 31){
                    day -=31;
                    continue;
                }
                else {
                    monthName = "January";
                    break;
                }
            }
            if (month == 2){
                if (year % 4 == 0 && year % 100 != 0 && day > 29){
                    day -= 29;
                    continue;
                }
                else if (day > 28){
                    day -= 28;
                    continue;
                }
                else{
                    monthName = "February";
                    break;
                }
            }
            if (month == 3){
                if (day > 31){
                    day -=31;
                    continue;
                }
                else {
                    monthName = "March";
                    break;
                }
            }
            if (month == 4){
                if (day > 30){
                    day -=30;
                    continue;
                }
                else {
                    monthName = "April";
                    break;
                }
            }
            if (month == 5){
                if (day > 31){
                    day -=31;
                    continue;
                }
                else {
                    monthName = "May";
                    break;
                }
            }
            if (month == 6){
                if (day > 30){
                    day -=30;
                    continue;
                }
                else {
                    monthName = "June";
                    break;
                }
            }
            if (month == 7){
                if (day > 31){
                    day -= 31;
                    continue;
                }
                else {
                    monthName = "July";
                    break;
                }
            }
            if (month == 8){
                if (day > 31){
                    day -= 31;
                    continue;
                }
                else {
                    monthName = "August";
                    break;
                }
            }
            if (month == 9){
                if (day > 30){
                    day -= 30;
                    continue;
                }
                else {
                    monthName = "September";
                    break;
                }
            }
            if (month == 10){
                if (day > 31){
                    day -= 31;
                    continue;
                }
                else {
                    monthName = "October";
                    break;
                }
            }
            if (month == 11){
                if (day > 30){
                    day -= 30;
                    continue;
                }
                else {
                    monthName = "November";
                    break;
                }
            }
            if (month == 12){
                if (day > 31){
                    day -= 31;
                    continue;
                }
                else {
                    monthName = "December";
                    break;
                }
            }
        }
        return monthName;
    }
    public static int getYear(){
        long millis = System.currentTimeMillis() / (1000*60*60*24);
        int day = (int)millis;
        int year = 1970;

        while(day > 365){
            if (year % 4 == 0 && year % 100 != 0){
                day -= 366;
            }
            else {
                day -= 365;
            }
            year++;
        }
        return year;
    }
    public static int getDayOfCurrentYear(){
        long millis = System.currentTimeMillis() / (1000*60*60*24);
        int day = (int)millis;
        int year = 1970;

        while(day > 365){
            if (year % 4 == 0 && year % 100 != 0){
                day -= 366;
            }
            else {
                day -= 365;
            }
            year++;
        }
        return day;
    }
}