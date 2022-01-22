package day_38_MethodOverriding.DinnerTasks.EmployeeTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int iD, double salary, String companyName) {
        super(name, age, gender, iD, "Teacher", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is teaching");
    }
}
