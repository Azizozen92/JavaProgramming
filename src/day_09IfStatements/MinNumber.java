package day_09IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        //1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal
        //
        //            Ex:
        //                n1= 100, n2 = 200;
        //
        //            output:
        //                100 is the minimum number
        int n1= 500,
            n2= 200;
        boolean n1IsMin = n1>n2;// created boolean just to get in habit
        boolean n2IsMin = n1<n2;//
        boolean equal = n1==n2;//
        if (n1>n2){//if n2 is the minimum number
            System.out.println(n2+" is the minimum number");
        }
        if (n1<n2){//if n1 is the minimum number
            System.out.println(n1+" is the minimum number");
        }
        if(n1==n2){
            System.out.println("Equal");
        }
    }
}
