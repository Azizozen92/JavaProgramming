package day07_Operators;

public class SwapTwoVariable_WithTemporaryVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int temporaryVariable = a;
        a = b;
        b = temporaryVariable;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
