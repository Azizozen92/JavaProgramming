package day_36_Inheritance.DinnerTasks.EmployeeTask;

public class Tester extends Employee{

    public void testing(){
        System.out.println(jobTitle+" "+name+" is testing");
    }
    public void creatingTicket(){
        System.out.println(jobTitle+" "+name+" is creating ticket");
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", iD=" + iD +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
