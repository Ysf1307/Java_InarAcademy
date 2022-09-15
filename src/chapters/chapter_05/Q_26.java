package chapters.chapter_05;

public class Q_26 {
    public static void main(String[] args) {

        double result = 0;
        double preResult = 0;

        for (int i = 1;i < 10000;i++){
            for (int j = 1;j <= i;j++){
                preResult += 1 / j;
            }
            result += preResult;
        }
        result += 1;
        System.out.println("e for 'i = 10000' : " + result);

        for (int i = 1;i < 20000;i++){
            for (int j = 1;j <= i;j++){
                preResult += 1 / j;
            }
            result += preResult;
        }
        result += 1;
        System.out.println("e for 'i = 20000' : " + result);

        for (int i = 1;i < 100000;i++){
            for (int j = 1;j <= i;j++){
                preResult += 1 / j;
            }
            result += preResult;
        }
        result += 1;
        System.out.println("e for 'i = 100000' : " + result);
    }
}
