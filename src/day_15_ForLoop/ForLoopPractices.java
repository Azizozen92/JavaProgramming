package day_15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        for(int i=15; i<=45; i++){
            System.out.print(i+" ");
        }
        System.out.println("\nHello World");
        for (int i =100; i>=50;i--){//i: 100,99,98...
            System.out.print(i+" ");
        }
        System.out.println("\nHello");
        System.out.println("-----------------------------------");
        //Print all the even number between 1~55
        for (int i = 2; i<=55; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nHello");
        System.out.println("------------------------------------");
        //different way to do it
        for(int i= 2; i<=54; i += 2){
            System.out.print(i+" ");
            System.out.println();
        }



        }
    }

