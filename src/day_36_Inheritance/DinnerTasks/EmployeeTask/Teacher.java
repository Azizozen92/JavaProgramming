package day_36_Inheritance.DinnerTasks.EmployeeTask;

public class Teacher extends Employee{

    public void teaching(){
        System.out.println(jobTitle+" "+name+" is teaching");
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", iD=" + iD +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
