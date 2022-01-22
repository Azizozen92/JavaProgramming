package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        /*different approach for declaring multiple
         variables that share the same data type*/
        String name = "Abdulaziz Ozen",
         buildingNumber = "17214B",
         streetName = "Dark Cavern Court",
         city = "Houston",
         state = "TX",
         zipCode = "77095A";
        System.out.println(name+"\n"+buildingNumber+" "+streetName+ "\n"+city+", "+state+" "+zipCode);
        String shippingAddress = name+"\n"+buildingNumber+" "+streetName+ "\n"+city+", "+state+" "+zipCode;
        System.out.println(shippingAddress);

    }
}
