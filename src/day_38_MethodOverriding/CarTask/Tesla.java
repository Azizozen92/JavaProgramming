package day_38_MethodOverriding.CarTask;

public class Tesla extends Car {

    public Tesla(String model, int year, double price, String color, double miles) {
        super("Tesla", model, year, price, color, miles);
    }
    public void autoPilot(){
        System.out.println(brand+" is in autopilot");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+brand+" "+model);
    }
}
