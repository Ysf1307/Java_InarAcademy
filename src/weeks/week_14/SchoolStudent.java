package weeks.week_14;

public class SchoolStudent extends Student {
    private int classLevel;
    private double gradeMean;
    private int dayOfAbsence;
    private String discipline;
    final private int NUMBER_OF_STUDENTS_IN_CLASS = 20;

    public SchoolStudent(){
        this(10, 79.80, 7, "Math");
    }
    public SchoolStudent(int classLevel, double gradeMean, int dayOfAbsence, String discipline){
        this.classLevel = classLevel;
        this.gradeMean = gradeMean;
        this.dayOfAbsence = dayOfAbsence;
        this.discipline = discipline;
    }
    public SchoolStudent(String name, int age, String gender, double height, double weight, boolean isTurk){
        this();
        super.name = name;
        super.age = age;
        super.gender = gender;
        super.height = height;
        super.weight = weight;
        super.isTurk = isTurk;
    }

    final public int getClassLevel() {
        return classLevel;
    }

    public double getGradeMean() {
        return gradeMean;
    }

    public void setGradeMean(double gradeMean) {
        this.gradeMean = gradeMean;
    }

    public int getDayOfAbsence() {
        return dayOfAbsence;
    }

    public void setDayOfAbsence(int dayOfAbsence) {
        this.dayOfAbsence = dayOfAbsence;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getNUMBER_OF_STUDENTS_IN_CLASS() {
        return NUMBER_OF_STUDENTS_IN_CLASS;
    }
    private String absenceCondition(int dayOfAbsence){
        String absence;
        if (dayOfAbsence >= 25){
            absence = "Sınıfta kaldınız";
        }
        else absence = "Your right of absence day is " + (25 - getDayOfAbsence());
        return absence;
    }
    @Override
    public String toString(){
        String output = "Class: " + getClassLevel() + "\nGrade Mean: " + getGradeMean() + "\nDay of Absence: " + getDayOfAbsence()
                + "\nDiscipline: " + getDiscipline() + "\nNumber of students in class: " + getNUMBER_OF_STUDENTS_IN_CLASS()
                + "\nAbsence Condition: " + absenceCondition(getDayOfAbsence());
        return output;
    }
}

