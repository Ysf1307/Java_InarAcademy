package chapters.chapter_06;

public class Q_12 {
    public static void main(String[] args) {

        char ch1 = '1';
        char ch2 = 'Z';
        int numberPerLine = 10;

        printChars(ch1, ch2, numberPerLine);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int num1 = ch1;
        int num2 = ch2;
        int count = 0;

        for (int i = num1; i <= num2; i++) {
            count++;
            char character = (char) i;
            System.out.print(character + " ");
            if (count == numberPerLine) {
                System.out.println();
                count = 0;
            }

        }
    }
}
