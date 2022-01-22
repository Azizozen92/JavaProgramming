package day_38_MethodOverriding.DinnerTasks.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, int age, char gender, String size, String color) {
        super(name, "Cat", age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(breed+" "+name+" eat cat food");
    }
}
