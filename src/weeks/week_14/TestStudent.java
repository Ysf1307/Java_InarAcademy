package weeks.week_14;

public class TestStudent {
    public static void main(String[] args) {

        Student student1 = new Student();
        SchoolStudent student2 = new SchoolStudent();
        student2.setGender("Female");

        System.out.println(student1.toString());
        System.out.println("---------------------------");
        System.out.println(student2.toString());
        System.out.println("---------------------------");
        System.out.println(student2.getGender());
    }
}
