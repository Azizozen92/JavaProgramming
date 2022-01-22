package day_10NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;

        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("------------------------------");
        String result1 =(n%2==0)?"Even" : "Odd";
        System.out.println(result1);
        System.out.println("-----------------------");
        int age = 23;
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
       String eligible= (age>=21)? "Eligible" : "Not eligible";
        System.out.println(eligible);


        System.out.println("---------------------------------");
        int number = 0;


        String result3 =(number>0)? "Positive" :(number<0)?"Negative" : "Zero";
        System.out.println(result3);
        /*
        if (number>0){
            System.out.println("Positive");
        }else if (number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");

         */



        }
    }
