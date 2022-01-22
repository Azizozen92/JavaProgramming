package day_37_Inheritance.PhoneTask;

public final class iPhone extends Phone{

    public iPhone( String model, String size, double price, String color) {

        super("Apple", model, size, price, color);
    }
    public void faceTime(long phoneNumber){

        System.out.println(phoneNumber+" is facetiming");
    }
    public void faceTime(String email){

        System.out.println(email+" is facetiming");
    }
}
