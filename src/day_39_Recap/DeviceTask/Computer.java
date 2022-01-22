package day_39_Recap.DeviceTask;

public class Computer extends Device{

    public Computer(String brand, String model, double price, Boolean hasBattery, Boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void enterCD(){
        System.out.println(getBrand()+" "+getModel()+" has a CD being inserted");
    }
}
