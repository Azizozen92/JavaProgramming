package day_23_CustomMethods_Void;

import java.util.Arrays;
import java.util.Scanner;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        number1to100();
        System.out.println();

        evenNumbers1to100();
        System.out.println();

        eligibleToBuyAlcohol(17,true);
        System.out.println();

        eligibleToVote(29,true);
        System.out.println();

        gradeCalculator(88);
        System.out.println();

        areaOfCircle(5);
        System.out.println();

        areaOfSquare(4);
        System.out.println();

        dollarToEuro(100);
        System.out.println();

        dollarToLira(45);
        System.out.println();

        kilosToPounds(1);
        System.out.println();

        positiveOrNegative(12);
        System.out.println();

        eachChar("Aziz");
        System.out.println();


        printEachElement( new int[]{1,2,3,4,5} );
        System.out.println();

        calculator(4,5,'*');
        System.out.println();

        formatName("aziz","ozen");
        System.out.println();

        anagram("aziz","ziza");
        System.out.println();







    }
    public static void number1to100(){
        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+" ");
        }
    }
    public static void evenNumbers1to100(){
        for (int i = 2; i <=100 ; i+=2) {
            System.out.print(i+" ");
        }
    }
    public static void eligibleToBuyAlcohol(int age,boolean hasID){
        if(age>=21 && hasID){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }
    }
    public static void eligibleToVote(int age, boolean citizen){
        if (age >=18 && citizen){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }
    public static void gradeCalculator(int grade){
        String result = "";
        if (grade>= 0 && grade <= 100){
            if (grade>=90){
                result="A";
            }else if (grade >= 80){
                result="B";
            }else if (grade>= 70){
                result="C";
            }else if (grade >= 60){
                result="D";
            }else {
                result="F";
            }

        }else{
            System.out.println("Invalid Grade");
        }
        System.out.println(result);
    }
    public static void areaOfCircle(int radius){
        double areaOfCircle=3.14*radius*radius;
        System.out.println(areaOfCircle);
    }
    public static void areaOfSquare(int width){
        double areaOfSquare=width*width;
        System.out.println(areaOfSquare);
    }
    public static void dollarToEuro(double dollars){
        double totalEuros = dollars/100*89;
        System.out.println(totalEuros);
    }
    public static void dollarToLira(double dollars){
        System.out.println(dollars*13.78);
    }
    public static void kilosToPounds(double kilograms){
        System.out.println(kilograms*2.205);
    }
    public static void positiveOrNegative(int number){
        if (number >= 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
    public static void eachChar(String words){

        for (int i = 0; i < words.length() ; i++) {
            System.out.print(words.charAt(i)+" ");
        }
    }
    public static void printEachElement(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
    public static void calculator(double number1, double number2, char operator){
     String result=   (operator == '+')?""+(number1+number2):(operator == '-')?""+(number1-number2)
         :(operator == '/')?""+(number1/number2):(operator == '*')?""+(number1*number2):"Invalid Operator";
        System.out.println(result);
    }
    public static void formatName(String firstName, String lastName){
        String first = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        String last = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(first+" "+last);







}
    public static void anagram(String word1, String word2){
        char [] arr1 = word1.toLowerCase().toCharArray();
        char [] arr2 =word2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)){
            System.out.println("Is anagram");
        }else{
            System.out.println("Is not anagram");
        }}}


