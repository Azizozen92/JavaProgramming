package day_17_WhileAndDoWhileLoops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num = 0;

        do {
            sum += num;
            System.out.println("Enter a number");
            num = scan.nextInt();
        } while (num >= 0);
        System.out.println("The sum of numbers is :" + sum);

        }


        /*
        2. Write a program that calculates the sum of numbers entered
        by the user until user enters a negative number.

            hint: you need an infinite loop

         */
    }

