package day_39_Recap.MethodTask;

public class Dog extends FriendlyAnimal{

    public Dog(String breed, char gender, int age, String size, String color) {
        super("Dog", breed, gender, age, size, color, false, true, true);
    }


    public void eat() {
        System.out.println(getName()+" "+getBreed()+" is eating");
    }
    public void bark(){
        System.out.println(getName()+" "+getBreed()+" is barking");
    }
}
