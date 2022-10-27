package chapters.chapter_07;

public class Q_13 {

    private static int[] array = new int[54];

    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.printf("%2d %4d \n", count, getRandom());
        }

    }
    public static int getRandom(){

        int number = -1;
        while (true){
            number = (int)(Math.random()*54);
            array[number]++;
            if (array[number] > 1){
                continue;
            }
            else break;
        }
        return number;
    }
}
