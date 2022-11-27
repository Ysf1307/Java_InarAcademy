package chapters.chapter_11;

public class Faculty extends Employee{
    private String office;
    private int classHour;
    private String rank;


    public Faculty(){

    }
    public Faculty(String office, int classHour, String rank){
        this.office = office;
        this.classHour = classHour;
        this.rank = rank;
    }


    @Override
    public String getOffice() {
        return office;
    }

    @Override
    public void setOffice(String office) {
        this.office = office;
    }

    public int getClassHour() {
        return classHour;
    }

    public void setClassHour(int classHour) {
        this.classHour = classHour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString(){
        return "Class name is 'Faculty' and person's name is " + getName();
    }
}
