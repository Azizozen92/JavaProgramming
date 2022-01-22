package day_38_MethodOverriding.DinnerTasks.EmployeeTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int iD,  double salary, String companyName) {
        super(name, age, gender, iD, "Product Owner", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is meeting with clients");
    }

}
