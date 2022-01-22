package day_11_Switch_Scanner;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles:");
        int miles= scan.nextInt();
        double kilometer= miles*1.609;
        System.out.println(miles+" miles equal to "+kilometer+" kilometers");

    }
}
