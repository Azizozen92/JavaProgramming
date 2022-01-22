package day_39_Recap.CydeoTask;

public class Cydeo {

    public static void main(String[] args) {
        Tester tester = new Tester("Aziz",30,'M',123,"SDET",120000);
        tester.creatingTicket();
        System.out.println(tester);

        Developer developer = new Developer("Hamid",32,'M',124,"Senior Developer",140000);
        developer.fixingBugs();
        System.out.println(developer);

        Student student = new Student("Hamza",20,'M',125,"Sports Science");
        student.study();
        System.out.println(student);

        Teacher teacher = new Teacher("Daniel",32,'M',3,100000);
        teacher.work();
        System.out.println(teacher);

        System.out.println("--------------------------------------");
        developer.setAge(39);

        System.out.println(developer.getAge());
        System.out.println(developer);
        System.out.println("-----------------------------");
        developer.work();
        tester.work();
        teacher.work();
        //student.work();

        System.out.println("--------------------------");

        developer.drink();
        developer.sleep();
        developer.eat();
        developer.fixingBugs();

        System.out.println("----------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();
        tester.creatingTicket();
        //tester.fixingbugs();

        System.out.println("------------------------------");

        teacher.eat();
        teacher.sleep();
        teacher.drink();
        teacher.work();

        System.out.println("------------------------");

        student.eat();
        student.drink();
        student.sleep();
        student.study();






    }
}
