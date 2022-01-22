package day_38_MethodOverriding.CarTask;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color, double miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown(){
        System.out.println(brand+" is breaking down");
    }
    public void racing(){
        System.out.println(brand+" "+model+" is racing");
    }

    @Override
    public void start() {
        System.out.println("Press button to start "+brand+" "+model);
    }
}
