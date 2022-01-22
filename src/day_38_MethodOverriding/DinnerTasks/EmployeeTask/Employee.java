package day_38_MethodOverriding.DinnerTasks.EmployeeTask;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public int iD;
    public String jobTitle;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, int iD, String jobTitle, double salary, String companyName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.iD = iD;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }
    public void work(){
        System.out.println(jobTitle+" "+name+" is working ");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", iD=" + iD +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
