package day_39_Recap.MethodTask;

public class Dolphin extends FriendlyAnimal{
    public Dolphin(String breed, char gender, int age, String size, String color) {
        super("Dolphin", breed, gender, age, size, color, false, true, true);
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+" "+getName()+" is eating");
    }
    public void swim(){
        System.out.println(getBreed()+" "+getName()+" is swimming");
    }
}
