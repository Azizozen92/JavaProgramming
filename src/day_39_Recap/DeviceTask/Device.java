package day_39_Recap.DeviceTask;

public class Device {

    private String brand, model;
    private double price;
    private   Boolean hasBattery;
    private Boolean hasPowerButton;

    public Device(String brand, String model, double price, Boolean hasBattery, Boolean hasPowerButton) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            System.err.println("Invalid Brand");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Invalid Price "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }



    public void turnOn(){
        System.out.println(getBrand()+" "+getModel()+" is turning on");
    }
    public void turnOff(){
        System.out.println(getBrand()+" "+getModel()+" is turning off");

    }

}
