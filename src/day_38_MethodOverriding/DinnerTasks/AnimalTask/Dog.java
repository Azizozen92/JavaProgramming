package day_38_MethodOverriding.DinnerTasks.AnimalTask;

public class Dog extends Animal{
    public Dog(String name, int age, char gender, String size, String color) {
        super(name,"Dog", age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(breed+" "+name+" eats dog food");
    }
}
