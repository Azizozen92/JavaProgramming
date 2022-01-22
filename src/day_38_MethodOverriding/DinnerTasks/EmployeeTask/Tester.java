package day_38_MethodOverriding.DinnerTasks.EmployeeTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int iD, String jobTitle, double salary, String companyName) {
        super(name, age, gender, iD, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is running tests");
    }
}
