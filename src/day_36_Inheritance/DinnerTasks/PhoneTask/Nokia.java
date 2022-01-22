package day_36_Inheritance.DinnerTasks.PhoneTask;

public class Nokia extends Phone {

    public void selfDefense(){
        System.out.println(brand+" "+model+" is used for self defense");
    }

    public String toString() {
        return "Nokia{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
