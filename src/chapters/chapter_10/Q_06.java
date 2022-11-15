package chapters.chapter_10;

public class Q_06 {
    public static void main(String[] args) {

        StackOfIntegers stack = new StackOfIntegers();
        int number = 2;
        stack.push(number);
        number++;

        while (number <= 120){
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                stack.push(number);
            }
            number++;
        }

        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
