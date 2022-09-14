package chapters.chapter_05;

public class Q_11 {

    public static void main(String[] args) {

        String line ="";

        for (int i = 100; i < 200; i++){
            if (i % 5 == 0 ^ i % 6 == 0){
                line += i + " ";
            }
            if (line.length() == 40 || line.length() == 81 || line.length() == 122){
                line += "\n";
            }
        }
        System.out.println(line);
    }
}
