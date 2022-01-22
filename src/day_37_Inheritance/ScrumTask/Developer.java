package day_37_Inheritance.ScrumTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String jobTitle, int iD, double salary, String companyName) {
        super(name, age, gender, jobTitle, iD, salary, companyName);
    }
    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }

}
