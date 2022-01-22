package day_39_Recap.MethodTask;

public class Parrot extends FriendlyAnimal{

    public Parrot(String breed, char gender, int age, String size, String color) {
        super("Parrot", breed, gender, age, size, color, false, true, true);
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+" "+getName()+" is eating bugs");
    }
    public void fly(){
        System.out.println(getBreed()+" "+getName()+" is flying");
    }
    public void sing(){
        System.out.println(getBreed()+" "+getName()+" is singing");
    }
}
