package day_31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniToppings;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniToppings) {

        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", total price= $" + calcCost() +
                '}';
    }
    public double calcCost(){

        double startingPrice=(size == 'S')? 10 : (size == 'M')? 12 : 14;
        double totalPrice = startingPrice+ (numberOfCheeseTopping+numberOfPepperoniToppings)*2;
        return totalPrice;
    }
}
