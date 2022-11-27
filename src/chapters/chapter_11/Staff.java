package chapters.chapter_11;

public class Staff extends Employee{
    private String title;


    public Staff(){

    }
    public Staff(String title){
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return "Class name is 'Staff' and person's name is " + getName();
    }
}
