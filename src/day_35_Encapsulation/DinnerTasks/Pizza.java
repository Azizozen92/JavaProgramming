package day_35_Encapsulation.DinnerTasks;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.toLowerCase() == "small" || size.toLowerCase() == "medium" || size.toLowerCase() == "large" )){
            System.err.println("invalid pizza size");
            return;
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(size == "small" && numberOfCheeseTopping > 3 ){
            System.err.println("Exceeded number of toppings");
            return;
        }
        if (size == "medium" && numberOfCheeseTopping > 4){
            System.err.println("Exceeded number of toppings");
            return;
        }
        if (size == "large" && numberOfCheeseTopping > 5){
            System.err.println("Exceeded number of toppings");
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(size == "small" && numberOfPepperoniTopping > 4 ){
            System.err.println("Exceeded number of toppings");
            return;
        }
        if (size == "medium" && numberOfPepperoniTopping > 5){
            System.err.println("Exceeded number of toppings");
            return;
        }
        if (size == "large" && numberOfPepperoniTopping > 6){
            System.err.println("Exceeded number of toppings");
            return;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }
    public double calcCost(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        double price = (size.equalsIgnoreCase("small"))?10:(size.equalsIgnoreCase("medium"))?12:14;
        price += numberOfCheeseTopping*2 + numberOfPepperoniTopping*2;
        return price;
    }
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", PizzaCost=$" + calcCost(size, numberOfCheeseTopping, numberOfPepperoniTopping) +
                '}';
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large",7,5);
        System.out.println(pizza1);
    }
}
