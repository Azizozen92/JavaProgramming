package day_39_Recap.MethodTask;

public class Eagle extends WildAnimal{

    public Eagle( String breed, char gender, int age, String size, String color) {
        super("Eagle", breed, gender, age, size, color, true, false, false);
    }
    public void hunt() {
        System.out.println(getName()+" "+getBreed()+" is hunting snakes");
    }
}
