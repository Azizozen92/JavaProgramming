package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
//length,width,area,perimeter
        double length = 10.5;
        double width = 5.5;
        double perimeter = length * 2 + width * 2;
        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.println("perimeter = " + perimeter);
        double area = length * width;
        System.out.println("area = " + area);
    }
}
/*
 2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                        length
                        width

                        area = length * width
                        perimeter =  2 * (length + width)
 */