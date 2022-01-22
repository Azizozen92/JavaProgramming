package day_35_Encapsulation.DinnerTasks;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank() || name.isEmpty()){
            System.err.println("Name cannot be blank or empty");
        }
        for (int i = 0; i >= name.length()-1;i++){
            if(name.charAt(i) >= 33 & name.charAt(i) <=64){
                System.err.println("name cannot contain special characters");
                return;
            }
            if (!(name.toLowerCase().charAt(0) >='a' || name.toLowerCase().charAt(0) <= 'z')){
                System.err.println("name must star with letter");
                return;
            }
        }
        this.name = name;

    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<0){
            System.err.println("unit price cannot be negative");
            return;
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){
            System.err.println("quantity cannot be negative");
            return;
        }
        if(name.toLowerCase().equals("toilet paper") && quantity>1){
            System.err.println("Toilet paper quantity cannot be more than 1");
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {

        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);

    }
    public double totalCost(){
        return quantity*unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost= " + totalCost() +
                '}';
    }
}


