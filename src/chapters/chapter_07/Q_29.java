package chapters.chapter_07;

public class Q_29 {
    public static void main(String[] args) {

        int[] deckOfCards = new int[52];
        boolean[] isPicked = new boolean[52];
        int sum = 0;
        int numberOfPick = 0;

        for (int i = 0; i < 4; i++) {
            int pick = (int)(Math.random()*52);
            if (!deckOfCards[pick]){

            }
            sum += pick;
            numberOfPick++;
            if (sum >= 24){
                break;
            }
        }

        System.out.println("Number of picks: " + numberOfPick);
        System.out.println("Sum: " + sum);
    }
}
