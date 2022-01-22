package day_13_String;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email");

        String email= scan.next();

        String result= "";

        if(email.contains("_")){
            String firstName= email.substring(0,email.lastIndexOf("_"));
            String lastName=email.substring(email.lastIndexOf("_")+1,email.indexOf("@"));
            String domain = email.substring(email.lastIndexOf("@"));
            result=""+lastName+"_"+firstName+domain;
        }else{
            result=""+email;

        }
        System.out.println(result);


    }
}
