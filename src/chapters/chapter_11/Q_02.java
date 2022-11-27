package chapters.chapter_11;

import chapters.chapter_10.MyDate;

public class Q_02 {
    public static void main(String[] args) {

        Person person1 = new Person("Yusuf", "İzmir", 555, "ysf.com");
        Student student1 = new Student();
        student1.setName(person1.getName());
        Employee employee1 = new Employee("Security", 10000, new MyDate(2014,9,29));
        employee1.setName(person1.getName());
        Faculty faculty1 = new Faculty("Dean", 7, "Prof");
        faculty1.setName(person1.getName());
        Staff staff1 = new Staff("Secretary");
        staff1.setName(person1.getName());

        System.out.println(person1.toString());
        System.out.println(student1.toString());
        System.out.println(employee1.toString());
        System.out.println(faculty1.toString());
        System.out.println(staff1.toString());
    }
}
