package chapters.chapter_10;

public class Q_10 {
    public static void main(String[] args) {

        Queue list = new Queue();

        for (int i = 1; i <= 20; i++) {
        list.enqueue(i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(list.dequeue() + " ");
        }
    }
}
