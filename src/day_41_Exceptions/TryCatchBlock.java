package day_41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

    public static void main(String[] args) {

        System.out.println("Test Started");

        try{
            System.out.println(9/0);
            System.out.println("Try Block");
        }catch (ArithmeticException e){

            System.out.println("Catch Block");
            System.out.println("Arithmetic exception has occurred");
        }


        System.out.println("Test completed");


        System.out.println("-----------------------");

        System.out.println("Test 2 started");

        int[] numbers={1,2,3,4,5};

        try{

            System.out.println(numbers[4]);
            System.out.println("Try block");

        }catch (RuntimeException e){

           e.printStackTrace();//this is the preferred method to use in catch block
           // System.out.println(e.getMessage());
        }


        System.out.println("Test2 completed");

        System.out.println("-------------------------------");

        System.out.println("Test 3 started");


        try{
            System.out.println("Cydeo".substring(2,0));
        }catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();

        }
        System.out.println("Test3 started");

        System.out.println("------------------------------");

        System.out.println("Hello");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Cydeo");

        System.out.println("--------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
