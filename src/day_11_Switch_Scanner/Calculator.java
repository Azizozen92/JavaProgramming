package day_11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1= 200.5, n2=10.5;
        char operator = '/';
        boolean valid = operator=='+'||operator=='-'||operator=='*'||operator=='/';
        if (valid){
            switch(operator){
                case'+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n1/n2);
            }

        }else{
            System.out.println("Invalid Operator:"+operator);

        }

    }
}
/*n1 and n2 variables based on give value
  - + * /
 */