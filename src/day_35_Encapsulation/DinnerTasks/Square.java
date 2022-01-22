package day_35_Encapsulation.DinnerTasks;

public class Square {

    private double side;


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            return;
        }
        this.side = side;
    }

    public Square(double side) {
        setSide(side);
    }
    public double calcArea(){
        return side*side;
    }
    public double calcPerimeter(){
        return side*4;
    }

    public String toString() {
        return "Square{" +
                "side= " + side +
                "area= " + calcArea() +
                "perimeter= " + calcPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Square sq1 = new Square(4);
        System.out.println(sq1);

    }
}
