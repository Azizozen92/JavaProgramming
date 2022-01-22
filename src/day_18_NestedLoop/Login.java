package day_18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String username = scan.next();

        System.out.println("Enter password");
        String password = scan.next();
        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged In");
        }else{
            for (int i = 1; i < 4; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("enter username");
                username = scan.next();
                password = scan.next();
                if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("Logged In");
                    break;
                }

            }
            if (!(username.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.out.println("Your Account is locked");
            }
        }
    }
}