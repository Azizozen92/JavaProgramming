package day_11_Switch_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = scan.nextLine();
        System.out.println("Enter your Programming Language:");
        String language = scan.nextLine();//Java programming language
        System.out.println("Enter your age");
        int age= scan.nextInt();//24Enter
        scan.nextLine();
        System.out.println("Enter your school name");
        String schoolName= scan.nextLine();



        System.out.println("name = " + name);
        System.out.println("language = " + language);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
        scan.close();
    }
}
