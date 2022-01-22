package day_31_Constructors;

public class Rectangle {
    public double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return  width*length;

    }
    public double perimeter(){
        return  ((width*2)+(length*2));

    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", perimeter= " + perimeter() +
                ", area= " +calculateArea()+
                '}';
    }

}
