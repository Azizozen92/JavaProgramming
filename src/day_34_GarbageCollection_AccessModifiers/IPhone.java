package day_34_GarbageCollection_AccessModifiers;

public class IPhone {

    public static String brand;
    public int model;
    public String size;
    public String color;
    public double price;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;


    public IPhone(int model, String size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    static{
        brand="Apple";
        OS="IOS";
        isSmartPhone=true;
        madeIn="China";
        designedIn="USA";
    }
    public static void printOperatingSystem(){
        System.out.println("OS = " + OS);
    }
    
    public void call(long phoneNumber){

        System.out.println(brand + " " + model + " is calling " + phoneNumber);

    }
    public void text(long phoneNumber) {

        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }
    public void faceTime(long phoneNumber){

        System.out.println(brand + " " + model + " is facetiming " + phoneNumber);


    }
    public void faceTime(String email){

        System.out.println(brand + " " + model + " is facetiming " + email);

    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}