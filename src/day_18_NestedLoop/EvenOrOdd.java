package day_18_NestedLoop;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number");
            int num1 = scan.nextInt();
            if (num1 % 2 == 0) {
                    System.out.println("is even");
                } else {
                    System.out.println("is odd");
                }
                System.out.println("Would you like to enter another number");
                String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid Answer, please re- enter answer");
                answer = scan.next().toLowerCase();
            }

                if (answer.equals("no")) {
                    break;
                }}}}