package day_13_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter account number");
        String no = scan.next();
        String result="";
        if (no.length()==7 && no.charAt(0)=='2'){
            result=""+no;
        }else if(no.length()==10 && no.charAt(0)=='5'){
            result=""+no;
        }else{
            result="invalid number";
        }
        System.out.println(result);



        /*
        Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these
       account number is valid.
            > If the account number begins with a “2” the account number
            should be 7 characters long
            > If the account number begins with a “5” the account number
            should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the
            account number lengths
                    do not meet the expected results print “Invalid account
                     number”
         */
    }
}
