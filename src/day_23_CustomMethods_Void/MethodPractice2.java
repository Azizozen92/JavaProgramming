package day_23_CustomMethods_Void;

public class MethodPractice2 {
    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5Times();
        evenNumbers1to10();
    }
    // create a function that can print hello world 5 times
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }
    }
    //create a function that can print hello cydeo 5 times
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }
    //create a function that can print all the even numbers 1-10
    public static void evenNumbers1to10(){
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
    };
}
