package chapters.chapter_05;

public class Q_39 {
    public static void main(String[] args) {

        double salesAmount = 10000;
        double commission = (5000 * 0.08 + 5000 * 0.1) * 12;

        while (commission < 30000){
            commission = (salesAmount - 10000) * 0.12;
            salesAmount = salesAmount + 1;
        }
        System.out.println(salesAmount + "\t" + commission);
    }
}
