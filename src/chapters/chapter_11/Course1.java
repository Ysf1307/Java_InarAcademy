package chapters.chapter_11;

import java.util.ArrayList;

public class Course1 {
    private String courseName;
    private ArrayList<String> students;

    public Course1(){

    }
    public Course1(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students.add(student);
    }
    public ArrayList<String> getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return students.size();
    }
    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (student.equals(students.get(i))){
                index = i;
            }
        }
        if (index == -1){
            System.out.println("There is no such a student in the course");
        }
        students.remove(index);
    }
    public void clear(){
        students.clear();
    }
    public String toString(){
        String output = getCourseName() + "\n\n";
        for (int i = 0; i < students.size(); i++) {
            output += students.get(i) + "\n";
        }
        return output;
    }
}
