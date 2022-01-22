package day_37_Inheritance.AnimalTask;

import day_37_Inheritance.AnimalTask.Animal;

public class Dog extends Animal {

    public int a;

    public Dog(String name, String breed, char gender, int age, String size, String color, int a) {
        super(name, breed, gender, age, size, color);
        this.a = a;
    }

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void bark(){
        System.out.println(name+" is barking");

    }
}

