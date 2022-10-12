package chapters.chapter_06;

public class Q_32 {
    public static void main(String[] args) {

        int win = 0;
        int lose = 0;

        for (int i = 0; i < 10000; i++) {
            game();
            if (game()){
                win++;
            }
            else {
                lose++;
            }
        }
        System.out.println("Win Score : " + win + "\n" + "Lose Score : " + lose);
    }
    public static boolean game(){
        boolean result;
        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = dice1 + dice2;

        if (sum == 2 || sum == 3 || sum == 12) {
            result = false;
        } else if (sum == 7 || sum == 11) {
            result = true;
        } else {
            while (true) {
                int dice3 = rollDice();
                int dice4 = rollDice();
                int sum1 = dice3 + dice4;
                if (sum1 == 7) {
                    result = false;
                    break;
                } else if (sum == sum1) {
                    result = true;
                    break;
                } else {
                    dice1 = dice3;
                    dice2 = dice4;
                    sum = sum1;
                    continue;
                }
            }
        }
        return result;
    }
    public static int rollDice() {
        int dice = (int) (Math.random() * 6 + 1);
        return dice;
    }

}
