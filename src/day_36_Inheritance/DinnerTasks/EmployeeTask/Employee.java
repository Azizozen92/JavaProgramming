package day_36_Inheritance.DinnerTasks.EmployeeTask;

public class Employee {

    public String name;
    public char gender;
    public int age,iD;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, char gender, int age, int iD, String jobTitle, double salary) {

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.iD = iD;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", iD=" + iD +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
