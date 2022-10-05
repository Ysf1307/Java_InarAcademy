package chapters.chapter_06;

public class Q_15 {
    public static void main(String[] args) {
        System.out.println("Taxable Income\tSingle\t\t\tMJ or QW\tMarried Separate\tHead Of a House");
        System.out.println("-------------------------------------------------------------------------------------------------");

        double taxableIncome = 0;
        int status = 0;
        double tax = 0;

        for (taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 50){

            System.out.print(taxableIncome + "\t\t\t");

            for (status = 0; status <= 3; status++){
                tax = computeTax(status, taxableIncome);
                System.out.print(tax + "\t\t\t");
            }

            System.out.println();
        }
    }
    public static double computeTax(int status, double taxableIncome){

        double tax = 0;

        switch (status){
            case 0:
                tax =  8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                break;
            case 1:
                tax =  16700 * 0.10 + (taxableIncome - 16700) * 0.15;
                break;
            case 2:
                tax =  8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                break;
            case 3:
                tax =  11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
                break;
        }
        return tax;
    }
}
