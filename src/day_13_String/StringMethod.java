package day_13_String;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = "Cydeo";
        //index:       01234
        char third= word.charAt(2);
        System.out.println("third = " + third);
        /*
        char tenthChar= word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);//out of range
        
         */
        String s1 = "Batch 25 is the best batch.Java Programming";
        int totalCharacter=s1.length();
        System.out.println("totalCharacter = " + totalCharacter);
        char lastCharacter= s1.charAt(s1.length()-1);
        System.out.println("lastCharacter = " + lastCharacter);
        System.out.println("--------------------------");
        String str ="wooden spoon";
        str=str.toUpperCase();//create new String object
        System.out.println(str);

        String s = "Today is a great day to learn java programming language";
        s=s.toUpperCase();
        System.out.println(s);
    }
}
