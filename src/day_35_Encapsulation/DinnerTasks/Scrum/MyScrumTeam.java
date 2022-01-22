package day_35_Encapsulation.DinnerTasks.Scrum;

import day_31_Constructors.ScrumTask.Developer;
import day_31_Constructors.ScrumTask.ScrumTeam;
import day_31_Constructors.ScrumTask.Tester;

public class MyScrumTeam {
    public static void main(String[] args) {
        day_31_Constructors.ScrumTask.Tester tester1 = new day_31_Constructors.ScrumTask.Tester("Layan",11,"QA",110000);
        day_31_Constructors.ScrumTask.Tester tester2 = new day_31_Constructors.ScrumTask.Tester("Ali",43,"SDET",142000);
        day_31_Constructors.ScrumTask.Tester tester3 = new day_31_Constructors.ScrumTask.Tester("ALex",44,"SE",135000);
        day_31_Constructors.ScrumTask.Tester tester4 = new day_31_Constructors.ScrumTask.Tester("Lala",23,"SDET",115000);
        day_31_Constructors.ScrumTask.Tester[] testers={tester1,tester2,tester3,tester4};

        day_31_Constructors.ScrumTask.Developer developer1= new day_31_Constructors.ScrumTask.Developer("Olga",22,"Java Developer",125000);
        day_31_Constructors.ScrumTask.Developer developer2= new day_31_Constructors.ScrumTask.Developer("Aygun",39,"Java Master",185000);
        day_31_Constructors.ScrumTask.Developer developer3= new day_31_Constructors.ScrumTask.Developer("Tunc",28,"Software Developer",135000);
        day_31_Constructors.ScrumTask.Developer developer4= new day_31_Constructors.ScrumTask.Developer("Sinem",13,"Senior Developer",200000);
        day_31_Constructors.ScrumTask.Developer[] developers = {developer1,developer2,developer3,developer4};

        day_31_Constructors.ScrumTask.ScrumTeam scrum=new ScrumTeam("Nigara","Huseyin","Neira",14);
        //scrum.addTester(tester1);
        //scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);


        System.out.println(scrum);

        System.out.println("-----------------------------------------");
        for (Tester eachtester : scrum.testersList) {
            System.out.println(eachtester.name+ " : "+eachtester.salary);
        }
        for (Developer eachdeveloper : scrum.developersList) {
            System.out.println(eachdeveloper.name +" : "+eachdeveloper.salary);
        }
        System.out.println("----------------------------");

        scrum.removeTester(23);
        scrum.removeDeveloper(22);
        System.out.println(scrum);
    }
}
