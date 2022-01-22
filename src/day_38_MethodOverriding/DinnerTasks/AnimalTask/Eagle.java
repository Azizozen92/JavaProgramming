package day_38_MethodOverriding.DinnerTasks.AnimalTask;

public class Eagle extends Animal {
    public Eagle(String name,  int age, char gender, String size, String color) {
        super(name, "Eagle", age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(breed+" "+name+" eats snake");
    }
}
