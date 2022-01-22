package day_11_Switch_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product name");
        String productName = scan.nextLine();

        System.out.println("Enter the price");
        double price= scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity= scan.nextInt();

        System.out.println("Enter your first name");
        String firstName= scan.next();
        double total= quantity*price;
        System.out.println(firstName+" your order for "+quantity+" "+productName+" has been placed. Your total is "+total);
    }
}
