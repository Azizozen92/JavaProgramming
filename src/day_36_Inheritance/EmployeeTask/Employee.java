package day_36_Inheritance.EmployeeTask;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public String jobTitle;
    public int ID;
    public double salary;
    public String companyName;

    public void work() {
        System.out.println(name + " is working");
    }

    public void setInfo(String name, char gender, int age, String jobTitle, int ID, double salary, String companyName) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
        this.companyName = companyName;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public class Developer extends Employee {

        public void writingCodes() {

            System.out.println(jobTitle + " " + name + " is writing codes");
        }

    }
    public class Driver extends Employee{

        public void doingDonuts(){
            System.out.println(jobTitle+" "+name+" is doing donuts");
        }
    }





    public class Teacher extends Employee{

        public void isGettingAnnoyed(){
            System.out.println(jobTitle+" "+name+" is getting annoyed");
        }


    }

    public class Tester extends Employee {

        public void findingBugs(){
            System.out.println(name+" is finding bugs");
        }
    }



}