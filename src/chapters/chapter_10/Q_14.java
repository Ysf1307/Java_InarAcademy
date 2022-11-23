package chapters.chapter_10;

public class Q_14 {
    public static void main(String[] args) {

        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("Year: " + date1.getYear() + "\nMonth: " + date1.getMonth() + "\nDay of Month: " + date1.getDay());
        System.out.println("------------------------------------");
        System.out.println("Year: " + date2.getYear() + "\nMonth: " + date2.getMonth() + "\nDay of Month: " + date2.getDay());
    }
}
