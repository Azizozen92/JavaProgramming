package day_19_LoopAndStringPractice;

import java.util.Scanner;

public class AreaPerimeterOfCircle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    while (true){
        System.out.println("Enter radius of the circle:");
        double radius = scan.nextInt();
        while (!(radius > 0)) {
            System.err.println("Invalid Entry for the radius of circle");
            System.exit(0);
        }
        double diameter = radius * 2;
        double area = 3.14 * radius * radius;
        double perimeter = diameter * 3.14;

        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

        System.out.println("Would you like to calculate another circle");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid entry please re-enter");
            answer = scan.next();
        }if (answer.equals("no")){
            System.out.println("Thank you for using Cydeo Circle Calculatro app");
            break;

        }





        }

        }}




