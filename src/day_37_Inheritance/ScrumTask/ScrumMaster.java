package day_37_Inheritance.ScrumTask;

public class ScrumMaster extends Employee {

    public ScrumMaster(String name, int age, char gender, int iD, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", iD, salary, companyName);
    }
}
