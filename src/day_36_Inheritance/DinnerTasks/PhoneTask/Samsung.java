package day_36_Inheritance.DinnerTasks.PhoneTask;

import day_36_Inheritance.DinnerTasks.PhoneTask.Phone;

public class Samsung extends Phone {

    public void freeze(){
        System.out.println(brand+" "+model+" froze");
    }

    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
