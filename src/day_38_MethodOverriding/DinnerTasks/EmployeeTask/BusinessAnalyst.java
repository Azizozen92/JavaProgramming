package day_38_MethodOverriding.DinnerTasks.EmployeeTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int iD, double salary, String companyName) {
        super(name, age, gender, iD, "Business Analyst", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is creating reports");
    }

}
