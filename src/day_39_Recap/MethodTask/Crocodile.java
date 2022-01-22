package day_39_Recap.MethodTask;

public class Crocodile extends WildAnimal{

    public Crocodile(String breed, char gender, int age, String size, String color) {
        super("Crocodile", breed, gender, age, size, color, true, false, false);
    }
    public void hunt() {
        System.out.println(getName()+" "+getBreed()+" is hunting the hunters");
    }
}
