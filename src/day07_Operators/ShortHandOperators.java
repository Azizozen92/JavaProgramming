package day07_Operators;

import javax.lang.model.SourceVersion;

public class ShortHandOperators {
    public static void main(String[] args) {

        //assignment: =
        int number = 100;
        System.out.println("number =" + number);
        number = 200;
        System.out.println("number = " + number);

        String word = "Java Programming";
        System.out.println("word = " + word); // java programming
        word = "Wooden Spoon";
        System.out.println("word = " + word); // wooden spoon
        word = "Cydeo";
        System.out.println("word = " + word); //  cydeo

        word = "Java Programming";
        System.out.println("word = " + word);
        System.out.println("______________________");

        //Addition Assignment
        int x = 100;
        System.out.println("x ="+x);//200
        System.out.println("x ="+200);//300
        // x = x + 200;
        x +=200;
        System.out.println("x = " + x);
        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str); 
        
        double num1 = 2.5;
        System.out.println("num1 = " + num1); //2.5
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.5;
        //deposit 300$
        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("____________________");

        //withdraw 500$
        availableBalance -=500;
        System.out.println("availableBalance = " + availableBalance);

        availableBalance -= 200;
        availableBalance += 400;
        System.out.println("______________");

        double salary = 500000.5;
        salary *= 2;
        System.out.println("salary = " + salary);

        double doge = 0.000000001;
        doge *= 1000000;
        System.out.println("doge = " + doge);
        System.out.println("__________________________________________");
        
        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);
        System.out.println("-----------------");
        //remainder
        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);
        System.out.println("---------------------------------");
        int amount = 127; // cents
        int quarters = amount / 25;
        int cents = amount % 5;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("--------------------------");
        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        int y =300;
        y %= 16;
        System.out.println("y = " + y);

        System.out.println("-----------------------");

        int balance = 3500;
        //insurance fee 153$
        balance %= 153;
        System.out.println("balance = " + balance);

        int p = 100;
        int m = 200;
        boolean equal = p==m;
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" =="Good Guy";
        System.out.println("result8 = " + result8);
        boolean result9 = "Muhtar" == "Muhtar";
        System.out.println("result9 = " + result9);
        boolean result10 = 'A' == 'a';
        System.out.println("result10 = " + result10);

        boolean result11 = "Java" == "Java";
        System.out.println("result11 = " + result11);

        System.out.println("-------------------------------------");

        boolean result12 = 100 != 200; //true
        System.out.println("result12 = " + result12);

        boolean result13 = "Java" != "Break";//true
        System.out.println("result13 = " + result13);

        boolean result14 = 300 != 300;//false
        System.out.println("result14 = " + result14);

        
        






    }
}
