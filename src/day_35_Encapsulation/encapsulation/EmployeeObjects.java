package day_35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {


        Employee employee1 = new Employee("Tatiana",'F',28,110000);
        employee1.setAge(32);


        Employee employee2 = new Employee("Aygun",'F',31,115000);
        employee2.setName("Elvira");
        employee2.setSalary(125000);

        System.out.println(employee1);
    }
}
