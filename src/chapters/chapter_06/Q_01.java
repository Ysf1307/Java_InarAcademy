package chapters.chapter_06;

public class Q_01 {
    public static void main(String[] args) {

        int count = 1;
        int number = 0;
        String output = "";

        for (int i = 0; i < 100; i++) {
            number = getPentagonalNumber(i);
            output += number + " ";
            if (count % 10 == 0){
                output += "\n";
            }
            count ++;
        }
        System.out.println(output);
    }

    public static int getPentagonalNumber(int n){
        int number = n * ((3*n) - 1) / 2;
        return number;
    }
}
