package day_11_Switch_Scanner;

import java.util.Scanner;

public class InputOutputReplit {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grader!\nPlease etner subject name number 1 and score for this subject");
        String subject1= scan.next();
        int grade1= scan.nextInt();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2= scan.next();
        int grade2=scan.nextInt();

        System.out.println("Pleaser enter subject name number 3 and score for this subject");
        String subject3=scan.next();
        int grade3= scan.nextInt();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4= scan.next();
        int grade4= scan.nextInt();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5= scan.next();
        int grade5 = scan.nextInt();
        double averageScore=(grade1+grade2+grade3+grade4+grade5)/5;
        System.out.println("Summary: "+subject1+" - "+grade1+", "+subject2+" - "+grade2+", "+subject3+" - "+grade3+", "+subject4+" - "+grade4+", "+subject5+" - "+grade5+"\nYour average score is:"+averageScore+"\nThank you for using Grader! \nGoodbye!");
    }
}