package day_37_Inheritance.ScrumTask;

public class ProductOwner extends Employee {

    public ProductOwner(String name, int age, char gender, int iD, double salary, String companyName) {
        super(name, age, gender, "Product Owner", iD, salary, companyName);
    }
    public void gatherRequirements(){
        System.out.println(jobTitle+" is gathering requirements");
    }
}
