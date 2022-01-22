package day_30_CustomClasses;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Aziz",1000,'M',30,"Developer",100000,true);

        Employee employee2 = new Employee();
        employee2.setInfo("Anna",1001,'F',25,"Teller",85000,true);

        Employee employee3 = new Employee();
        employee3.setInfo("David",1002,'M',35,"Manager",45000,false);

        Employee employee4 = new Employee();
        employee4.setInfo("Lina",1004,'F',45,"Boss",80000,true);

        Employee employee5 = new Employee();
        employee5.setInfo("Kevin",1005,'M',35,"Senior QA",110000,true);

        Employee [] employees={employee1,employee2,employee3,employee4,employee5};
        int fulltime=0;
        int parttime=0;
        double max=employees[0].salary;
        double min=employees[0].salary;
        for (Employee emp : employees) {
            if(emp.isFulltime){
                fulltime++;
            }else{
                parttime++;
            }if(emp.salary>max){
                max=emp.salary;
            }
            if(emp.salary<min){
                min=emp.salary;
            }
        }
        System.out.println("fulltime = " + fulltime);
        System.out.println("parttime = " + parttime);
        System.out.println("max salary = " + max);
        System.out.println("min salary= " + min);
    }
}
