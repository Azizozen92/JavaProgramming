package day_39_Recap.MethodTask;

public class Tiger extends WildAnimal{

    public Tiger( String breed, char gender, int age, String size, String color) {
        super("Tiger", breed, gender, age, size, color, true, false, false);
    }
    public void hunt() {
        System.out.println(getName()+" "+getBreed()+" is hunting small animals");
    }

}
