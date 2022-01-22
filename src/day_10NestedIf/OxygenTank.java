package day_10NestedIf;

public class OxygenTank {
    public static void main(String[] args) {
        int oxy = 72;
        String result= " ";
        if(oxy>50&oxy<100){
           result=(oxy>90)?"Your tank is full":(oxy>80)?"Still okay":
                   (oxy>70)?"Dont go too far":(oxy>60)?"Start to head back"
                           :"Be careful now you at 50%";

        }
        System.out.println(result);
        //4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
        //                Above 90 -  Your tank is full
        //                Above 80 -  Still okay
        //                Above 70 -  Don't go too far
        //                Above 60 -  Start to head back
        //                Above 50 -  Be careful now you at at 50%
        //
        //                USE ONE PRINT STATEMENT ONLY
    }
}
