package chapters.chapter_11;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack myStack = new MyStack();

        System.out.println("Enter 5 Strings:");
        for (int i = 0; i < 5; i++) {
            myStack.push(input.next());
        }

        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
    }
}
