package day_36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setInfo("Max","Husky",'M',2,"Small","Brown");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        Cat cat = new Cat();

        cat.setInfo("tarcin","British",'M',3,"Small","yellow");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();



        Tiger tiger = new Tiger();

        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large","Orange");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();


    }
}
