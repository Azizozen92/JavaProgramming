package day08_IfStatements;

public class SingleIfStatementsIntro {
    public static void main(String[] args) {
        int number = 101;
        boolean evenNumber= number%2==0;

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
        */
        if (evenNumber) {
            System.out.println(number + " is even number");
        }
        if(!evenNumber){
            System.out.println(number+" is not even number");
        }

        int n = 200;
        if(n>0) {//if n is greater than 0
            System.out.println(n + " is positive");
        }
            if(n< 0) {//if n is less than 0
                System.out.println(n + " is negative");
            }
            if(n==0){
                System.out.println(n+" is zero");

            }

        }



    }

