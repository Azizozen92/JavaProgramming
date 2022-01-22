package day_30_CustomClasses;

public class Cat {
    public String name;
    public String breed;
    public int weight;
    public boolean isNeutered;
    public char gender;
    public int age;


    public void setInfo(String name, String breed, int weight, boolean isNeutered, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.isNeutered = isNeutered;
        this.gender = gender;
        this.age = age;
    }


    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", isNeutered=" + isNeutered +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
