package day_17_WhileAndDoWhileLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter email");
        String u = scan.next();

        System.out.println("Enter password");
        String p = scan.next();

            int attempts = 3;
            while(!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0){
                System.out.println("Incorrect username or password");
                System.out.println("Reenter username");
                u = scan.next();

                System.out.println("Reenter password");
                p= scan.next();
                attempts--;
            }

            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("Logged In");

        }else{
                System.out.println("Your account is locked");
            }
        }



    }

