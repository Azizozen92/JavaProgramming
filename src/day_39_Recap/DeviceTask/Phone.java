package day_39_Recap.DeviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, double price, Boolean hasBattery, Boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void call(long phoneNumber){
        System.out.println(getBrand()+" "+getModel()+" "+phoneNumber+" is calling");
    }
    public void text(long phoneNumber){
        System.out.println(getBrand()+" "+getModel()+" "+phoneNumber+" is texting");

}
}
