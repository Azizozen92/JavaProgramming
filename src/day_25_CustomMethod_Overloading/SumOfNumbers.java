package day_25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {

       int sum2= sumOfNumbers(1,2);
        System.out.println("sum = " + sum2);
       int sum3= sumOfNumbers(10,20,30);
        System.out.println("sum3 = " + sum3);
       int sum4=sumOfNumbers(10,20,30,40);
        System.out.println("sum4 = " + sum4);
    }
    public static int sumOfNumbers(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }

}
