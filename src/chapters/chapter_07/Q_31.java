package chapters.chapter_07;

import java.util.Scanner;

public class Q_31 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] list1 = createList();
        int[] list2 = createList();
        int[] mergedList = mergeList(list1, list2);
        int[] sortedList = sortList(mergedList);
        printList(list1);
        printList(list2);
        printList(mergedList);
        printList(sortedList);
    }
    public static int[] createList() {
        System.out.println("Enter list:");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
    public static int[] mergeList(int[] list1, int[] list2) {
        int mergedListLength = list1.length + list2.length;
        int[] mergedList = new int[mergedListLength];

        for (int i = 0; i < list1.length; i++) {
            mergedList[i] = list1[i];
        }
        for (int i = list1.length; i < mergedListLength; i++) {
            mergedList[i] = list2[i - list1.length];
        }
        return mergedList;
    }

    public static int[] sortList(int[] list) {

        int[] sortedList = new int[list.length];
        System.arraycopy(list, 0, sortedList,0, list.length);
        for (int i = 0; i < sortedList.length; i++) {
            int minNumber = Integer.MAX_VALUE;
            int minNumberIndex = -1;
            for (int j = i; j < sortedList.length; j++) {
                if (sortedList[j] < minNumber){
                    minNumber = sortedList[j];
                    minNumberIndex = j;
                }
            }
            int temp = sortedList[i];
            sortedList[i] = minNumber;
            sortedList[minNumberIndex] = temp;
        }
        return sortedList;
    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }


}
