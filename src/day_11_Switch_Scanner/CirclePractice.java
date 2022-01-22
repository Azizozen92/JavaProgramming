package day_11_Switch_Scanner;

import java.util.Scanner;

public class CirclePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius here");
        double num= input.nextDouble();

        System.out.println("area: "+(num*num*3.14));
        System.out.println("perimeter: "+(2*3.14*num));

        input.close();
    }
}
