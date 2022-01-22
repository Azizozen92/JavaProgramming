package day_11_Switch_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total shares");
        int shares= scan.nextInt();

        System.out.println("Enter total stock value");
        int value= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter company name");
        String company= scan.nextLine();
        System.out.println("Your total stock market holding is $"+value+" which is made up of "+shares+" shares. "+company+" is your company");

    }
}
