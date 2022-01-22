package day_36_Inheritance.DinnerTasks.EmployeeTask;

public class Developer extends Employee{

    public void coding(){
        System.out.println(jobTitle+" "+name+" is coding");
    }
    public void fixingBugs(){
        System.out.println(jobTitle+" "+name+" is fixing bugs");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", iD=" + iD +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
