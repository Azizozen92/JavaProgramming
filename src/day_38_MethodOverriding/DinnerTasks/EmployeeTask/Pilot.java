package day_38_MethodOverriding.DinnerTasks.EmployeeTask;

public class Pilot extends Employee{
    public Pilot(String name, int age, char gender, int iD, double salary, String companyName) {
        super(name, age, gender, iD, "Pilot", salary, companyName);

    }

    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is flying a plane");
    }
}
