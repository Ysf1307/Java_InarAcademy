package chapters.chapter_10;

import java.util.Arrays;

public class Queue {
    int[] elements;
    int size;
    static final int DEFAULT_CAPACITY = 8;

    public Queue(){
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    public void enqueue(int entry){
        if ((size + 1) > elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = entry;
        size++;
    }

    public int dequeue() {
        int outputNumber = -1;
        if (size > 0) {
            outputNumber = elements[0];
            for (int i = 1; i < size; i++) {
                elements[i - 1] = elements[i];
            }
            size--;
        }
        return outputNumber;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}