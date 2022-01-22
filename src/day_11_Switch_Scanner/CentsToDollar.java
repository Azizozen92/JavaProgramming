package day_11_Switch_Scanner;

import java.util.Scanner;

public class CentsToDollar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents");
        int cents = scan.nextInt();
        int dollar =cents/100;
        int cents2 = cents%100;
        System.out.println(cents+" cents equal to: "+dollar+" dollars and "+cents2+" cents");
        //Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
        //            Ex:
        //                Enter cents
        //                225
        //
        //                output:
        //                225 cents equal to: 2 dollars and 25 cents
        //
        //
        //4. Write a program that can convert Miles to KM
        //            Ex:
    }
}
