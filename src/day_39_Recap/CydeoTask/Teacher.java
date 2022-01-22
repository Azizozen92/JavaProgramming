package day_39_Recap.CydeoTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int employeeId, double salary) {
        super(name, age, gender, employeeId, "Teacher", salary);
    }


    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is teaching");
    }

    public String toString() {
        return super.toString();
    }
}

