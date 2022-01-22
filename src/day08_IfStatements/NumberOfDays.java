package day08_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        //3. Create a class called NumberOfDays, Write a program that can print the number of days in a month
        //nts:
        //                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
        //                Months that has 30 days: 4, 6, 9, 11
        //                Month that has 28 days: 2
        int num = 11;//finding out how many days this specific month has
        boolean has28Days = num==2;
        boolean has30Days = num==4||num==6||num==9||num==11;
        boolean has31Days = !has30Days&&!has28Days;//if the month doesnt have 28 days and doesnt have 30 days
        if(has28Days){//if the months have 28 days
            System.out.println("28days");
        }
        if (has30Days){//if the month has 30 days
            System.out.println("30 days");

        }
        if(has31Days)//if the month has 31 days
            System.out.println("31 days");
    }
}
