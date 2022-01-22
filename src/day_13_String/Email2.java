package day_13_String;

import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email here");
        String email=scan.next();
        String firstName= email.substring(0,email.indexOf("_"));
        String lastName= email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        System.out.println("firstName = " + firstName.substring(0,1).toUpperCase()+firstName.substring(1));
        System.out.println("lastName = " + lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("domain = " + domain);
        
        
        
        
    }
    
}
