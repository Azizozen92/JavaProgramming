package day_09IfStatements;

public class Practice {
    public static void main(String[] args) {
        int num1 = 100, num2 = 1000;
        if (num1>num2){
            System.out.println(num1+" is the maximum number");
        }else{
            System.out.println(num2+" is the maximum number");
        }
        int num3=400, num4= 600;
        if (num3>num4){
            System.out.println(num4+" is the minimumm number");
        }else{
            System.out.println(num3+" is the minimum number");
        }
        int age = 34;
        String name = "Josh";
        if (age>21){
            System.out.println(name+" is eligible to buy alcohol");
        }else{
            System.out.println(name+" is NOT eligible to buy alcohol");
        }
        int age2 = 42;
        String country = "USA", name3 = "Aziz";
        if(age>21 && country=="USA"){
            System.out.println(name3+" is eligible to vote");
        }else{
            System.out.println(name3+" is not eligible to vote");
        }







        // 1. Maximum number between two different numbers
        // 2. Minimum number between two different numbers
        // 3. Write a program that can check if the person is eligible to buy alcohol
        // 4. Write a program that can check if the person is eligible to vote
    }
}
