package day_39_Recap.DeviceTask;

public class TV extends Device{

    public TV(String brand, String model, double price, Boolean hasBattery, Boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void channelUp(){
        System.out.println(getBrand()+" "+getModel()+" channel up");
    }
    public void channelDown(){
        System.out.println(getBrand()+" "+getModel()+" channel down");
    }

}
