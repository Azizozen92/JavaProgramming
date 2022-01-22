package day_39_Recap.MethodTask;

public class Animal {

    private String name,breed;
    private char gender;
    private int age;
    private String size,color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {

        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M' || gender == 'F')){
            System.err.println("Invalid Gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ){
            System.err.println("Invalid age "+age);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public void eat(){
        System.out.println(getBreed()+" "+getName()+" is eating");
    }
    public void drink(){
        System.out.println(getBreed()+" "+getName()+" is drinking");
    }
    public void sleep(){
        System.out.println(getBreed()+" "+getName()+" is sleeping");
    }
    public void move(){
        System.out.println(getBreed()+" "+getName()+" is moving");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
