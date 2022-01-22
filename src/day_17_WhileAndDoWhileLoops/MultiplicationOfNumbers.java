package day_17_WhileAndDoWhileLoops;

import java.util.Scanner;

public class MultiplicationOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        int multi = 0;

        for (int i = 0; i < num2; i++) {
            multi += num1;

        }
        System.out.println(multi);
    }
}
