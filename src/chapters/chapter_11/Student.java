package chapters.chapter_11;

public class Student extends Person{
    private final String classStatus = "Senior";


    public Student(){

    }


    public String getClassStatus() {
        return classStatus;
    }

    public String toString(){
        return "Class name is 'Student' and person's name is " + getName();
    }
}
