package day_11_Switch_Scanner;


import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Print full name");
        String name = input.nextLine();

        System.out.println("Enter Building number");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter Street name");
        String streetName = input.nextLine();

        System.out.println("Provide city name");
        String cityName = input.nextLine();

        System.out.println("Enter State");
        String state = input.next();

        System.out.println("Enter your zipcode");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter your country name");
        String countryName = input.nextLine();

        System.out.println(name+"\n"+buildingNumber+" "+streetName+"\n"+
        cityName+", "+state+", "+zipCode+", "+countryName);

    }
}
//enter your full name
//enter your building number
//provide street name
//provide city name
//enter state in one word
//enter zip code
//Display the shipping address
//name
//building number+street name
//city name, state, zip code