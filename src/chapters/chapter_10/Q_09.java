package chapters.chapter_10;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Course course = new Course("Math");

        System.out.println("Enter 3 students to add course as String");
        course.addStudent(input.next());
        course.addStudent(input.next());
        course.addStudent(input.next());

        System.out.println(course.toString());

        System.out.println("Enter a student to remove from course as String");
        course.dropStudent(input.next());

        System.out.println(course.toString());
    }
}
