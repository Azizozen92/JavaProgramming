package day_38_MethodOverriding.DinnerTasks.EmployeeTask;

public class Developer extends Employee{

    public int numberOfProjects;

    public Developer(String name, int age, char gender, int iD, String jobTitle, double salary, String companyName, int numberOfProjects) {
        super(name, age, gender, iD, jobTitle, salary, companyName);
        this.numberOfProjects = numberOfProjects;
    }

    public Developer(String name, int age, char gender, int iD, String jobTitle, double salary, String companyName) {
        super(name, age, gender, iD, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is developing codes");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "numberOfProjects=" + numberOfProjects +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", iD=" + iD +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
