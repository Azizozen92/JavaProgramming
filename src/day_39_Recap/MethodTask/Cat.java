package day_39_Recap.MethodTask;

public class Cat extends FriendlyAnimal{

    public Cat(String breed, char gender, int age, String size, String color) {
        super("Cat", breed, gender, age, size, color, false, true, true);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" "+getBreed()+" is eating");
    }
    public void scratch(){
        System.out.println(getName()+" "+getBreed()+" is scratching");
    }
    public void meow(){
        System.out.println(getName()+" "+getBreed()+" is meowing");
    }

}
