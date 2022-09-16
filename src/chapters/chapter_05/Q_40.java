package chapters.chapter_05;

public class Q_40 {
    public static void main(String[] args) {

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1000000; i++){
            int coin = ((int)(Math.random()*10) % 2);
            if (coin == 0){
                heads++;
            }
            else {
                tails++;
            }
        }
        System.out.println("Heads: " + heads + "\nTails: " + tails);
    }
}
