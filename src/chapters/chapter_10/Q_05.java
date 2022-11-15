package chapters.chapter_10;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();
        StackOfIntegers stack1 = new StackOfIntegers();

        int divisor = 2;
        while (number != 1){
            if (number % divisor == 0){
                stack.push(divisor);
                number = number / divisor;
            }
            else divisor++;
        }
        while (!stack.empty()) {
            stack1.push(stack.pop());
        }
        while (!stack1.empty()){
            System.out.print(stack1.pop() + " ");
        }
    }
}
