package day_39_Recap.MethodTask;

public class Lion extends WildAnimal{

    public Lion(String breed, char gender, int age, String size, String color) {
        super("Lion", breed, gender, age, size, color, true, false, false);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" "+getBreed()+" is hunting hyenas");
    }
}
