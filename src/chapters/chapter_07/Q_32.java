package chapters.chapter_07;

import java.util.Scanner;

public class Q_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list:");
        int numberOfElements = input.nextInt();
        int[] list = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            list[i] = input.nextInt();
        }

        int pivot = list[0];
        int pivotIndex = partition(list);
        int[] newList = new int[numberOfElements];
        int index = 0;

        for (int i = 0; i < pivotIndex; i++) {
            while (index < newList.length){
                index++;
                if (list[index] <= pivot){
                    newList[i] = list[index];
                    break;
                }
                else continue;
            }
        }
        newList[pivotIndex] = pivot;
        index = 0;
        for (int i = pivotIndex+1; i < newList.length; i++) {
            while (index < list.length){
                index++;
                if (list[index] > pivot){
                    newList[i] = list[index];
                    break;
                }
                else continue;
            }
        }

        System.out.print("After the partition, the list is ");
        for (int i = 0; i < newList.length; i++) {
            System.out.print(newList[i] + " ");
        }
    }

    public static int partition(int[] list) {
        int pivot = list[0];
        int pivotIndex = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i] <= pivot){
                pivotIndex++;
            }
        }
        return pivotIndex;
    }
}
