package day_10NestedIf;

public class CampusTime {
    public static void main(String[] args) {
        int hour = 50;
        String result ="";
        if (hour>=1&&hour<=24){
           result= (hour>=8&&hour<=23)?"Open":"Closed";

        }else{
            result="Invalid Hour";
        }System.out.println(result);
        //1.  Create a class called CampusTime, an integer variable named time i
        // s given with a number between 1~24 has been initialized,
        // write a program that can find out if the campus is open or not.
        // Campus is open from 8 am(8) to 11 pm (23) If user enters a time
        // within the open time they should see message: “open”  but if the
        // time entered is outside of operating hours they should see:
        // “ closed”
    }
}
