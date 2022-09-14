package chapters.chapter_05;

public class Q_19 {
    public static void main(String[] args) {

        String output = "";

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < (7-i); j++){
                output += "\t";
            }
            for (int k = 0; k < (i+1); k++){
                double temp1 = k;
                int l = (int)Math.pow(2, temp1);
                output += l + "\t";
            }
            for (int m = (i-1); m >= 0; m--){
                double temp2 = m;
                int n = (int)Math.pow(2, temp2);
                output += n + "\t";
            }
            output += "\n";
        }
        System.out.println(output);


    }
}
