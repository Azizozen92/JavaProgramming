package day_23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(7);
        ageOfPerson(1992);
        allNumbersBetween(10,20);

    }//create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){
        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }
    //create a function that can display the age of the person
    public static void ageOfPerson(int birthyear){
        int age=2021-birthyear;
        System.out.println("Age of person: "+age);
    }
    public static void allNumbersBetween(int x, int y){
        for (int i = x; i <= y; i++) {
            System.out.print(i+" ");
        }
    }
}
