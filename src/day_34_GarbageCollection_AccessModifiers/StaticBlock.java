package day_34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("main method");
    }

    static{ //runs before anything, runs one time

        System.out.println("Static block");
    }
}
