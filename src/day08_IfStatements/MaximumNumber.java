package day08_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {
        //3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal
        //
        //            Ex:
        //                n1= 100, n2 = 200;
        //
        //            output:
        //                200 is the maximum number
        int n1=100,
                n2=200;
        if (n1>n2){
            System.out.println(n1+" is the maximum number");

        }
        if(n1<n2){
            System.out.println(n2+ " is the maximum number");
        }
        if (n1==n2){
            System.out.println("Equal");
        }
        }


}
