package day_37_Inheritance.PhoneTask;

public class Phone { //parent class only contains common features of all the child classes

    String brand, model,size;
    public double price;
    public String color;

    public static boolean hasBattery;

    public Phone(String brand, String model, String size, double price, String color) {

        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    static {
        hasBattery = true;
    }
    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting "+phoneNumber);
    }

    public String toString() {

        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $ " + price +
                ", color='" + color + '\'' +
                ", has battery ='" + hasBattery + '\'' +
                '}';
    }
}
