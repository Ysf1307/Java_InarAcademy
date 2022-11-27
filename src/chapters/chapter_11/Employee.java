package chapters.chapter_11;

import chapters.chapter_10.MyDate;

public class Employee extends Person{
    private String office;
    private double salary;
    private MyDate dateHired;


    public Employee(){

    }
    public Employee(String office, double salary, MyDate dateHired){
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }


    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public String toString(){
        return "Class name is 'Employee' and person's name is " + getName();
    }
}
