package day_39_Recap.DeviceTask;

public class PersonalComputer extends Computer{

    public PersonalComputer(String brand, String model, double price, Boolean hasBattery) {
        super(brand, model, price, hasBattery, true);
    }
}
