package day_38_MethodOverriding.CarTask;

public class Toyota extends Car {

    public Toyota(String model, int year, double price, String color, double miles) {
        super("Toyota", model, year, price, color, miles);
    }
    public void reliable(){
        System.out.println(brand+" is realiable");

    }
    public void start(){
        System.out.println("Twist the key in the ignition to start "+brand+" "+model);
    }
}
