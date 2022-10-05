package chapters.chapter_06;

public class Q_11 {
    public static void main(String[] args) {
        
        double salesAmount = 0;
        double commission = 0;
        System.out.println("Sales Amount\tCommission\n------------------------");

        for (salesAmount = 10000; salesAmount <= 100000 ; salesAmount += 5000) {
            commission = computeCommission(salesAmount);
            System.out.println(salesAmount + "\t\t\t" + commission);
        }
    }
    public static double computeCommission(double salesAmount){

        double commission = 0;

        if (salesAmount <= 10000){
            commission = (5000 * 0.08) + ((salesAmount - 5000) * 0.1);
        }
        else {
            commission = (5000 * 0.08) + (5000 * 0.1) + ((salesAmount - 10000) * 0.12);
        }

        return commission;
    }
}
