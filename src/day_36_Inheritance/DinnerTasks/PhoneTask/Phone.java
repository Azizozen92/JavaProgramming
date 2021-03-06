package day_36_Inheritance.DinnerTasks.PhoneTask;

public class Phone {

    public String brand,model,size;
    public double price;
    public String color;

    public void setInfo(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public void call(long phoneNumber){
        System.out.println("Call "+phoneNumber);
    }
    public  void text(long phoneNumber){
        System.out.println("Text "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
