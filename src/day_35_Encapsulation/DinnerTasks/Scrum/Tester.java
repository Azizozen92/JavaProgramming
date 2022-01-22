package day_35_Encapsulation.DinnerTasks.Scrum;

public class Tester {


        private String name;
        private int employeeID;
        private String jobTitle;
        private double salary;

        public Tester() {
            setName(name);
            setEmployeeID(employeeID);
            setJobTitle(jobTitle);
            setSalary(salary);

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
            if(employeeID < 0 ){
                System.err.println("Employee ID cannot be negative");
            }
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0 ){
            System.err.println("Salary cannot be negative");
            return;
        }
        this.salary = salary;
    }

    public String toString() {
            return "Tester{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary= $" + salary +
                    '}';
        }
        public void smokeTesting(){
            System.out.println(name+" is smoke testing");
        }
        public void creatingTicket(){
            System.out.println(name+" is creating ticket");
        }


    }

