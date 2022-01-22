package day_10NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 30;
        String result = " ";
        if(age>=0&&age<=150){
           result= (age<21)?"Teenager":(age>=21&&age<55)?"Adult":"Senior";
        }else {result="Invalid Age";
        }
        System.out.println(result);
       // 4. Create a class called AgeGroups, write a program that can
        // define the age groups of a person Teenager (< 21)
        //                    Adult   (>=21 && <55 )
        //                    Senior  ( > 55 )
    }
}
