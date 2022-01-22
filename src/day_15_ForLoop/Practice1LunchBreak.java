package day_15_ForLoop;

import java.util.Scanner;

public class Practice1LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter email");
        String email = scan.next();
        Boolean valid = email.endsWith("@gmail.com");
        String result = "";

        if(valid){
            result="Valid";
        }else{
            result="Not Valid";
        }
        System.out.println(result);
    }
}
