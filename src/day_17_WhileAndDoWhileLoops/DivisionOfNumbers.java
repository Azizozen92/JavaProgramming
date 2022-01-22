package day_17_WhileAndDoWhileLoops;

import java.util.Scanner;

public class DivisionOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number: ");
        int num1 = scan.nextInt(); // 15
        System.out.println("Second number");
        int num2 = scan.nextInt(); // 5

        int result = 0;

        if (num1 > num2) {
            for (int i = num1; i >= num2; i -= num2) {
                result++;
            }
        }
        System.out.println("num1/num2 = " + result);
    }
}
