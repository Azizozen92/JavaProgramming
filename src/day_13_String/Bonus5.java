package day_13_String;

import java.util.Scanner;

public class Bonus5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word here");
        String word = scan.next();
        String result = "";
        if(word.charAt(0)>=48 && word.charAt(0)<=57){
            result= "first character is digit";
        }else if(word.charAt(0)>=65 && word.charAt(0)<=90){
            result="first character is uppercase";
        }else if(word.charAt(0)>=97 && word.charAt(0)<=122){
            result="first character is lower case";
        }else{
            result="first character is special characrer";
        }
        System.out.println(result);



        /*
        Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character
        is lowercase letter"
        if the word starts with lowercase letters, print "first character
        is uppercase letter"
        if the word starts with special characters, print "first character
        is special character"
         */
    }
}
