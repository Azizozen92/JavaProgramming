package day_09IfStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator = '*';
        int n1= 10, n2 = 20;
        if(operator=='-'){
            System.out.println(n1-n2);
        }else if (operator=='+'){
            System.out.println(n1+n2);
        }else if(operator=='*'){
            System.out.println(n1*n2);
        }else{
            System.out.println((double)n1/n2);
        }
    }
}
