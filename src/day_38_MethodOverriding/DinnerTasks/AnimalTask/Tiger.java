package day_38_MethodOverriding.DinnerTasks.AnimalTask;

public class Tiger extends Animal{
    public Tiger(String name, String breed, int age, char gender, String size, String color) {
        super(name, "Tiger", age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(breed+" "+name+" eats deer");
    }

}
