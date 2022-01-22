package day_18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        System.out.println("-----------------------------------");

        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");

            }

        }
    }
}
