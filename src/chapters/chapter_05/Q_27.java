package chapters.chapter_05;

public class Q_27 {
    public static void main(String[] args) {

        String output = "";
        int count = 0;
        int leapCount=0;

        for (int i = 101; i < 2100; i++){
            if (i % 4 == 0 && i % 100 != 0){
                output += i + " ";
                count++;
                leapCount++;
            }
            if (count % 10 == 0 && count != 0){
                output += "\n";
                count =0;
            }

        }
        System.out.println("Number of leap years between 101 and 2100 is " + leapCount);
        System.out.println(output);
    }
}
