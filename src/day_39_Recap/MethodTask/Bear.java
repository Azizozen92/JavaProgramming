package day_39_Recap.MethodTask;

public class Bear extends WildAnimal{

    public Bear( String breed, char gender, int age, String size, String color) {
        super("Bear", breed, gender, age, size, color, true, false, false);

    }
    public void hunt() {
        System.out.println(getName()+" "+getBreed()+" is hunting salmon");
    }
}
