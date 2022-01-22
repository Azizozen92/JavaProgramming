package day_10NestedIf;

public class BiggerNumber {
    public static void main(String[] args) {
        int n1= 4, n2 = 1 , n3 = 2;
        String result = "";
        result=(n1>n2&&n1>n3)?"n1 is bigger number":(n2>n1&&n2>n3)?"n2 is the bigger number":"n3 is the bigger number";
        System.out.println(result);
        //Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.
        //
        //        you get 3 int variables with DIFFERENT values: n1 , n2 and n3
        //
        //            if n1 is biggest output: "n1 is bigger"
        //            if n2 is biggest output: "n2 is bigger"
        //            if n3 is biggest output: "n3 is bigger"
    }
}
