package chapters.chapter_07;

public class Q_07 {
    public static void main(String[] args) {

        int[] countArray = new int[10];

        for (int i = 0; i < 100; i++) {
            int number = (int)(Math.random()*10);
            countArray[number]++;
        }
        for (int i = 0; i < countArray.length; i++) {
            System.out.println(i + "s: " + countArray[i]);
        }
    }
}
