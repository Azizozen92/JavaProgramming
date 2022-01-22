package day_36_Inheritance.DinnerTasks.EmployeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.creatingTicket();

        Developer developer = new Developer();
        developer.fixingBugs();

        Teacher teacher = new Teacher();
        teacher.teaching();

        Driver driver = new Driver();
        driver.drivering();
    }
}
