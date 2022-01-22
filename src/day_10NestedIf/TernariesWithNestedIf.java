package day_10NestedIf;

import java.util.Scanner;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();
        String result="";
        if(num2>num1){
            System.out.println(num2);
        }else if (num1>num2){
            System.out.println(num1);
        }

        }

    }
