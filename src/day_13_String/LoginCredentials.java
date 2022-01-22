package day_13_String;

import java.util.Scanner;

public class LoginCredentials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter email here");
        String email=scan.nextLine();

        System.out.println("Enter password here");
        String password= scan.next();

        String result="";
        if(password.equals("WoodenSpoon")&&email.equals("Cydeo")){
            result="Logged In";
        }else{
            result="Incorrect username of password";
        }
        System.out.println(result);

        //ou are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
        //                    username: Cydeo
        //                    password: WoodenSpoon
        //
        //        Ask the user to enter their credentials. If credentials are matched,
        //        your program should print "Logged in."
        //
        //        otherwise print "Incorrect username or password" as error message
        //
        //    	Hints: 	In order to login, both username and password MUST be correct
        //    			you will need to use equals() method
    }
}