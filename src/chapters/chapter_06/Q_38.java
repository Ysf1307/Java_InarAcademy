package chapters.chapter_06;

public class Q_38 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
            if (i % 10 == 9){
                System.out.println();
            }
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(getRandomDigitCharacter() + " ");
            if (i % 10 == 9){
                System.out.println();
            }
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
}