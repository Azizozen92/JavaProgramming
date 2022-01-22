package day_39_Recap.CydeoTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int employeeId,String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is developing codes");
    }

    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing bugs");
    }

    public String toString() {
        return super.toString();
    }
}

