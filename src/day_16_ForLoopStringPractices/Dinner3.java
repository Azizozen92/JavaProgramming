package day_16_ForLoopStringPractices;

import java.util.Scanner;

public class Dinner3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number here");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = 0;
        for (int i = 0; i < num2; i++) {
            result+=num1;

        }
        System.out.println(result);


    }
}
