package day_35_Encapsulation.DinnerTasks;

public class Rectangle {

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){
            System.err.println("Invalid Width "+width);
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if (length <= 0){
            System.err.println("Invalid length "+length);
        }
        this.length = length;
    }

    public Rectangle(double width, double length) {

        setWidth(width);
        setLength(length);
    }
    public double calcArea(){
        return width*length;
    }
    public double calcPerimeter(){
        return (width*2)+(length*2);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area= " + calcArea() +
                ", perimeter= " + calcPerimeter() +
                '}';
    }
}
