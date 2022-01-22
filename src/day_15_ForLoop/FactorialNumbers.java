package day_15_ForLoop;

public class FactorialNumbers {
    public static void main(String[] args) {
        double number= 1;
        for (int i = 5; i > 0; i--) {
            number *= i;
        }
        System.out.println(number);
    }

}
