package day_38_MethodOverriding.DinnerTasks.EmployeeTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, int iD, double salary, String companyName) {
        super(name, age, gender, iD, "Scrum Master", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is leading a meeting");
    }

}
