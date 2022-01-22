package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1= +25;
        int num2= -25;
        System.out.println( num1< 0);//false
        System.out.println(num2<0);//true

        int a = 5;
        ++a; // pre increment increases value by 1 right away
        System.out.println(a);

        --a; // pre decrement decreases the value by 1 right away
        System.out.println(a);


        int b = 100;
        System.out.println(++b); //pre increment:
        int c = 100;
        System.out.println(c++);//post increment:
        System.out.println(c); //101

        int x = 200;

        System.out.println(--x);
        int y = 200;
        System.out.println(y--);
        System.out.println(y);
        System.out.println("-----------");


        int z = 45;
        System.out.println(++z);//46
        System.out.println(z++);//46
        System.out.println(z);//47

        int q = 30;
        System.out.println(--q); //29
        System.out.println(q--); //29
        System.out.println(q);//28



        System.out.println("-----------------------");
        double pi = 3.14;
        boolean w = 119 % 5 == 0;
        int num = 0;
        System.out.println(w);



    }
}
