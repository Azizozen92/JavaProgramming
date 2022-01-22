package day_15_ForLoop;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName= scan.next();
        String lastName= scan.next();

       String firstName1= firstName.substring(0,1).toUpperCase()+firstName.substring(1);
       String lastName2= lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        System.out.println(firstName1+" "+lastName2);

    }
}
