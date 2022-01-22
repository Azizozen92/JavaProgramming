package day_15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
scan.close();
        int min = 2147483647;
        for (int i = 10; i<15 ; i++) {
            System.out.println("enter number");
            int num = scan.nextInt();
            if(num<min){
                min=num;
            }
        }
        System.out.println("min:"+min);
        /*
        ask the user to enter 5 numbers and return minimum number
         */
    }
}
