package day_39_Recap.MethodTask;

public class WildAnimal extends Animal{

    private Boolean isWild,isFriendly,isPlayable;

    public void hunt(){
        System.out.println(getBreed()+" "+getName()+" is hunting");
    }

    public WildAnimal(String name, String breed, char gender, int age, String size, String color, Boolean isWild, Boolean isFriendly, Boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }
}
