package day_37_Inheritance.PhoneTask;

public class Nokia extends Phone {

    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void selfDefense(){
        System.out.println(brand+" "+model+" is used for self defense");
    }
}
