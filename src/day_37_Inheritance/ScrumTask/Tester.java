package day_37_Inheritance.ScrumTask;

public class Tester extends Employee{//Tester IS an employee= is a relationship
    // Tester is a Person as well

    public Tester(String name, int age, char gender, String jobTitle, int iD, double salary, String companyName) {
        super(name, age, gender, jobTitle, iD, salary, companyName);
    }
    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is creating ticket");
    }

}
