package day_30_CustomClasses;

public class Employee {
    public String names;
    public int ID;
    public char gender;
    public int age;
    public String jobTitle;
    public double salary;
    public Boolean isFulltime;

    public void setInfo(String names, int ID, char gender, int age, String jobTitle, double salary, Boolean isFulltime) {
        this.names = names;
        this.ID = ID;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFulltime = isFulltime;
    }

    public String toString() {
        return "Employee{" +
                "names='" + names + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", isFulltime=" + isFulltime +
                '}';
    }

    public void work(){
        System.out.println(jobTitle+" "+names+" is working");
    }
}
