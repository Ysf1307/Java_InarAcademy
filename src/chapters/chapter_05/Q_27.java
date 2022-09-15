package chapters.chapter_05;

public class Q_27 {
    public static void main(String[] args) {

        String output = "";
        int count = 0;

        for (int i = 101; i < 2100; i++){
            if (i % 4 == 0 && i % 100 != 0){
                output += i + " ";
                count++;
            }
            if (count % 10 == 0){
                output += "\n";
            }

        }
        System.out.println("Number of leap years between 101 and 2100 is " + count);
        System.out.println(output);
    }
}
