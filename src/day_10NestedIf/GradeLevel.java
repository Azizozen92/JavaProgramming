package day_10NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        int g = 5;
        String result = " ";
        if (g>=1&&g<=18){
         result=   (g>=1&&g<=5)?"Elementary School" :(g>=6&&g<=8)?"Middle School":(g>=9&&g<=12)?"High School"
             :(g>=13&&g<=16)?"College":"Grad School";

        }else{
            result="Invalid Score";
        }
        System.out.println(result);
        }
        //1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
        //            grade level and types are:
        //                    1-5: Elementary school
        //                    6-8: Middle school
        //                    9-12: High school
        //                    13-16: College
        //                    17-18: Grad School
        //
        //                    For Any Other grade: Invalid grade level given
        //
        //            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
    }

