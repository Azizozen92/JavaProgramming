package day_35_Encapsulation.DinnerTasks;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            System.err.println("Invalid Amount");
            return;
        }
        this.quantity = quantity;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println("Invalid Price");
            return;
            }
        if(price == 0){
            System.out.println("Free");
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String toString() {
        if(price == 0){
            System.out.println("Free");
        }
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price  +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
