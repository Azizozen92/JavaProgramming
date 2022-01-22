package day_37_Inheritance.ScrumTask;

public class BusinessAnalyst extends Employee {

    public BusinessAnalyst(String name, int age, char gender, int iD, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", iD, salary, companyName);

    }
    public void analyze(){
        System.out.println(name+" is analyzing the documents");
    }
}
