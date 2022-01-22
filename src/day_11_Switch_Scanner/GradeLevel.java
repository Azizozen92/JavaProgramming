package day_11_Switch_Scanner;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {//this solution is using if/scanner/switch
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade level");
        byte grade = input.nextByte();
        String result = "";
        if (grade>=1&&grade<=18){


        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result = "Elementary School";
                break;
            case 6:
            case 7:
            case 8:
                result = "Middle School";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                result = "High School";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                result = "College";
                break;
                    default:
                result = "Grad School";
                break;

        }}else{

        }
        System.out.println(result);
        input.close();
        //1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
        //            grade level and types are:
        //                    1-5: Elementary school
        //                    6-8: Middle school
        //                    9-12: High school
        //                    13-16: College
        //                    17-18: Grad School
    }
}
