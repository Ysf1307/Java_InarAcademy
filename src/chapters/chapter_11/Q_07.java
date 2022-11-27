package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Random;

public class Q_07 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = (int)(Math.random()*100);
            list.add(number);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }

        shuffle(list);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
    }
    public static void shuffle(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        Random randomIndex = new Random();
        newList.addAll(list);
        list.clear();
        while (!newList.isEmpty()){
            list.add(newList.remove(randomIndex.nextInt(newList.size())));
        }
    }
}
