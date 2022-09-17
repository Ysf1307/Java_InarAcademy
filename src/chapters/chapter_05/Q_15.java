package chapters.chapter_05;

public class Q_15 {

    public static void main(String[] args) {

        String output = "";
        int count = 0;

        for (int i = 33; i < 127; i++){
            output += (char)i + " ";
            count++;
            if (count % 10 == 0){
                output += "\n";
            }
        }
        System.out.println(output);
    }
}
