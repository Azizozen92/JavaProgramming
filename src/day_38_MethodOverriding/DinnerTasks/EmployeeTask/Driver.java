package day_38_MethodOverriding.DinnerTasks.EmployeeTask;

public class Driver extends Employee{
    public Driver(String name, int age, char gender, int iD, double salary, String companyName) {
        super(name, age, gender, iD, "Driver", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is driving");
    }
}
