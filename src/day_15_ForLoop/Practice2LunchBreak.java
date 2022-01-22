package day_15_ForLoop;

import java.util.Scanner;

public class Practice2LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Website");
        String website = scan.next();
        boolean start = website.toLowerCase().startsWith("www.");
        boolean end = website.toLowerCase().endsWith(".com");
        boolean end2 = website.toLowerCase().endsWith(".edu");
        boolean end3 = website.toLowerCase().endsWith(".gov");

        String result = "";
        if(start && end || end2 || end3){
            result="Valid";
        }else {
            result="Not valid";
        }
        System.out.println(result);
    }
}
