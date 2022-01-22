package day_15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648;//any user entered number will be greater than this

        for (int i = 0; i < 7; i++) {

            System.out.println("Enter a number:");
            int num=scan.nextInt();

            if(num>max){//if the user entered number is greater than current max number
                max=num;
            }


        }System.out.println(max);

        /*
        write a program to ask the user to enter a number 5 times,
        return the maximum number
         */
    }
}
