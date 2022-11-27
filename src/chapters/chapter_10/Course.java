package chapters.chapter_10;

public class Course {
    private String courseName;
    private String[] students = new String[0];
    private int numberOfStudents;

    public Course(){

    }
    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        numberOfStudents++;
        String[] temp = new String[numberOfStudents];
        System.arraycopy(students, 0, temp, 0, students.length);
        students = temp;
        students[numberOfStudents - 1] = student;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])){
                index = i;
            }
        }
        if (index == -1){
            System.out.println("There is no such a student in the course");
        }
        else {
            for (int i = index; i < students.length - 1; i++) {
                students[i] = students[i + 1];
            }
            numberOfStudents--;
            String[] temp = new String[numberOfStudents];
            System.arraycopy(students, 0, temp, 0, temp.length);
            students = temp;
        }
    }
    public void clear(){
        String[] temp = new String[0];
        students = temp;
    }
    public String toString(){
        String output = getCourseName() + "\n\n";
        for (int i = 0; i < students.length; i++) {
            output += students[i] + "\n";
        }
        return output;
    }


}
