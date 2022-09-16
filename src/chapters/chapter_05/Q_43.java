package chapters.chapter_05;

public class Q_43 {
    public static void main(String[] args) {

        String output = "";
        int count = 0;

        for (int i = 1; i < 8; i++){
            for (int j = 1; j < 8; j++){
                if (j != i){
                    output += i + " " + j + "\n";
                    count++;
                }
            }
        }
        System.out.println("The total number of all combinations is " + count);
        System.out.println(output);
    }
}
