package day_11_Switch_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter your full name");
        String name = input.nextLine();
        System.out.println("Enter you GPA");
        double gpa = input.nextDouble();
        input.nextLine();
        System.out.println("Enter your school name");
        String schoolName = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("name = " + name);
        input.close();



    }
}
//ask the user to enter their age
//ask the user to enter full name