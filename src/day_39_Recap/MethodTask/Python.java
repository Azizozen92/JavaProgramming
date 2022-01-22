package day_39_Recap.MethodTask;

public class Python extends WildAnimal{

    public Python( String breed, char gender, int age, String size, String color) {
        super("Python", breed, gender, age, size, color, true, false, false);
    }
    public void hunt() {
        System.out.println(getName()+" "+getBreed()+" is hunting rats");
    }
}
