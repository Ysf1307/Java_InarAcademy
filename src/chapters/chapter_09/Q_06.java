package chapters.chapter_09;

public class Q_06 {
    public static void main(String[] args) {

        int[] list = new int[100000];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)Math.random()*100;
        }

        StopWatch.start();
        sortList(list);
        StopWatch.end();

        System.out.println("The time elapsed is " + StopWatch.getElapsedTime() + " miliseconds");

    }
    public static int[] sortList(int[] list) {

        for (int i = 0; i < list.length; i++) {
            int minNumber = Integer.MAX_VALUE;
            int minNumberIndex = -1;
            for (int j = i; j < list.length; j++) {
                if (list[j] < minNumber){
                    minNumber = list[j];
                    minNumberIndex = j;
                }
            }
            int temp = list[i];
            list[i] = minNumber;
            list[minNumberIndex] = temp;
        }
        return list;
    }
}
