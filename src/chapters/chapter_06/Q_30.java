package chapters.chapter_06;

public class Q_30 {
    public static void main(String[] args) {

        int dice1 = rollDice();
        int dice2 = rollDice();
        int sum = dice1 + dice2;

        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
            System.out.println("You lose");
        } else if (sum == 7 || sum == 11) {
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
            System.out.println("You win");
        } else {
            while (true) {
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
                System.out.println("The point is " + sum);
                int dice3 = rollDice();
                int dice4 = rollDice();
                int sum1 = dice3 + dice4;
                if (sum1 == 7) {
                    System.out.println("You rolled " + dice3 + " + " + dice4 + " = " + sum1);
                    System.out.println("You lose");
                    break;
                } else if (sum == sum1) {
                    System.out.println("You rolled " + dice3 + " + " + dice4 + " = " + sum1);
                    System.out.println("You win");
                    break;
                } else {
                    dice1 = dice3;
                    dice2 = dice4;
                    sum = sum1;
                    continue;
                }
            }
        }
    }

    public static int rollDice() {
        int dice = (int) (Math.random() * 6 + 1);
        return dice;
    }
}
