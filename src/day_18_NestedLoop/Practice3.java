package day_18_NestedLoop;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter first number");
            int num = scan.nextInt();

            System.out.println("Enter math operator");
            String operator = scan.next();

            while(!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))){
                System.out.println("Invalid operator,enter correct operator");
                operator= scan.next();
            }
            System.out.println("Enter second number");
            int num2 = scan.nextInt();
            int result=0;
            if (operator.equals("+")){
                result=(num+num2);
            }else if(operator.equals("-")){
                result=(num-num2);
            }else if(operator.equals("*")){
                result=(num*num2);
            }else{
                result=(num/num2);
            }

            System.out.println("Do you want to continue");
            String answer = scan.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no") )) {
                System.out.println("Invalid Entry, please re-enter");
                answer = scan.next();
            }
                if (answer.equals("no")){
                    System.out.println(result);
                    System.out.println("Thank you for using Cydeo Calculator");
                    break;
                }



            System.out.println(result);

        }

    }
}


