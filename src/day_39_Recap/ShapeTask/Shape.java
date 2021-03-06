package day_39_Recap.ShapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("Name cannot be null");
            System.exit(1);//one thing went wrong
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid Name");
            System.exit(1);//one thing went wrong
        }
        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public String answer(){
        return "";
    }


    @Override
    public String toString() {
        return "Shape{" +
                "name'" + name+'\''+
                "area'" + area()+'\''+
                "perimeter='" + perimeter()+'\''+
                '}';
    }
}
