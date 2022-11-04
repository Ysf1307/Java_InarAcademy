package chapters.chapter_09;

public class Q_08 {
    public static void main(String[] args) {

        Fan fan1 = new Fan(true, 3, 10, "yellow");
        Fan fan2 = new Fan(true, 2,5,"blue");

        fan1.printFan();
        System.out.println("------------------------------");
        fan2.printFan();
    }
}
