package day_37_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "German Shepard", 'M', 2, "Large", "Black");
        System.out.println(dog1);
        dog1.bark();
        //dog1.scratch();
        //dog1.sing();

        Cat cat1 = new Cat("Love", "Siamese",'F',2,"Large","Black");
        System.out.println(cat1);
        cat1.scratch();
        //cat1.bark();;


        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small",
                "Blue");
        System.out.println(parrot1);
        parrot1.sing();
        //parrot1.bark();




    }

    public static class Parrot extends Animal {

        public Parrot(String name, String breed, char gender, int age, String size, String color) {
            super(name, breed, gender, age, size, color);
        }
        public void sing(){
            System.out.println(name+" is singing");
        }
    }
}
