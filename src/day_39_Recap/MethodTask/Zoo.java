package day_39_Recap.MethodTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Kangal",'M',5,"Large","Brown");
        dog.bark();
        dog.pet();
        dog.play();
        System.out.println(dog);

        System.out.println();

        Cat cat = new Cat("Tuxedo",'F',4,"Small","Black/White");
        cat.meow();
        cat.scratch();
        System.out.println(cat);

        System.out.println();

        Dolphin dolphin = new Dolphin("Orca",'M',12,"Large","Black");
        dolphin.swim();
        System.out.println(dolphin);

        System.out.println();

        Parrot parrot = new Parrot("Macaw",'F',3,"Small","Grey");
        parrot.fly();
        parrot.sing();
        System.out.println(parrot);

        System.out.println();

        Lion lion = new Lion("Asiatic",'M',14,"Large","Brown");
        lion.hunt();
        System.out.println(lion);

        System.out.println();

        Tiger tiger = new Tiger("Toros",'F',18,"Large","Orange");
        tiger.hunt();
        System.out.println(tiger);

        System.out.println();

        Eagle eagle = new Eagle("Bald",'M',5,"Medium","Brown/White");
        eagle.hunt();
        System.out.println(eagle);

        Bear bear = new Bear("Black",'F',32,"Large","Black");
        bear.hunt();

        Python python = new Python("Burmese",'M',5,"Small","Black");
        python.hunt();

        Crocodile crocodile = new Crocodile("Florida",'F',18,"Large","Green");
        crocodile.hunt();




    }
}
