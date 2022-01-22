package utilities;

public class MathUtility {
    public static void main(String[] args) {

    }

    //returns addition of 2 ints
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //returns addition of 2 doubles
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    //subtraction of 2 integers
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    //subtraction of 2 doubles
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    //multiplication of 2 integers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    //multiplication of 2 doubles
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    //divison of 2 doubles
    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    //checks if integer is even returns boolean
    public static boolean evenNumber(int num) {
        boolean isEven = false;
        if (num % 2 == 0) {
            isEven = true;
        }
        return isEven;
    }

    //check to see if integer is odd returns boolean
    public static boolean oddNumber(int num) {
        boolean isOdd = false;
        if (num % 2 != 0) {
            isOdd = true;
        }
        return isOdd;

    }

    //retruns value of larger integer
    public static int maxNumber(int num1, int num2){

        int max = 0;
        if(num1>num2){
            max=num1;
        }else{
            max=num2;
        }
    return max;
    }

    //returns smaller integer
    public static int minNumber(int num1, int num2){
        int min=0;
        if(num1<num2){
            min=num1;
        }else{
            min=num2;
        }
        return min;
    }

    //returns the number squared
    public static int numberSquared(int num){
        return num*num;
    }

    //returns the number squared
    public static double numberSquared(double num){
        return num*num;
    }

    //returns the number cubed
    public static int numberCubed(int num){
        return num*num*num;
    }

    //returns the number cubed
    public static double numberCubed(double num){
        return num*num*num;
    }


}
