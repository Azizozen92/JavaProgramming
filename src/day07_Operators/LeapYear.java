package day07_Operators;

import org.w3c.dom.ls.LSOutput;

public class LeapYear {
    public static void main(String[] args) {


        int year = 2020;
        boolean isLeapYear = year % 4 == 0;
        System.out.println(year+" is leap year: "+isLeapYear);
    }
}
