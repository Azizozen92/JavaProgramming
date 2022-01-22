package day_19_LoopAndStringPractice;

import java.util.Scanner;

public class CalculateAreaOfSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter side of the square");
            int side = scan.nextInt();
            while(!(side>0)){
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            
            }
            int area = side*side;
            int perimeter =side*4;
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another square");
            String answer = scan.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid entry please re-enter answer");
                answer=scan.next();
            }
            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }






        }
    }
}
