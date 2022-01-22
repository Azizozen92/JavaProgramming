package day_39_Recap.MethodTask;

public class FriendlyAnimal extends Animal {

    private Boolean isWild,isFriendly,isPlayable;


    public void play(){
        System.out.println(getBreed()+" "+getName()+" is playing");
    }
    public void pet(){
        System.out.println(getBreed()+" "+getName()+" is being pet");
    }

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color, Boolean isWild, Boolean isFriendly, Boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }
}
