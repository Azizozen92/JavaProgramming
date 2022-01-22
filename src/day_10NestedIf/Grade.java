package day_10NestedIf;

public class Grade {
    public static void main(String[] args) {
        char g = 'F';
        String result = " ";
        if(g=='A' || g=='B' || g=='C' || g=='D' || g=='F'){
          result=  (g=='A')?"excellent":(g=='B')?"great job":(g=='C')?"good":(g=='D')?"passed":
            "failed";
        }else{
            result="Invalid Grade";
        }
        System.out.println(g+": "+result);
        //create a class called Grade, a char variable named grade is given. write a program to print the following messages:
        //            'A': excellent
        //            'B': great job
        //            'C': good
        //            'D': passed
        //            'F': failed
        //            other wise: invalid
    }
}
