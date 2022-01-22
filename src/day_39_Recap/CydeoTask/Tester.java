package day_39_Recap.CydeoTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" is working");
    }
    public void creatingTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating a ticket");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
