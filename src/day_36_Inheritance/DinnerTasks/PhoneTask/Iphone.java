package day_36_Inheritance.DinnerTasks.PhoneTask;

public class Iphone extends Phone {

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+" is facetiming");
    }
    public void faceTime(String email){
        System.out.println(email+" is facetiming");
    }

    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
