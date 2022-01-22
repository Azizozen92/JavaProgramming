package day_19_LoopAndStringPractice;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true){

        System.out.println("Enter your score");
        int score = scan.nextInt();


        while (!(score>=0 && score<=100)){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        if (score >= 90 && score <= 100) {
            System.out.println("A");

        }else if (score>=80){
            System.out.println("B");

        }else if (score>=70){
            System.out.println("C");

        }else if (score>=60){
            System.out.println("D");

        }else {
            System.out.println("F");
        }
            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("no")) && answer.equals("yes")){
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }

        }
    }}

