package day_13_String;

import java.util.Scanner;

public class ThreeLetterWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word= scan.next();
        char middle= word.charAt(1);
        String result="";
        if(word.length()==3){
            if(middle=='a') {
                result = "cool word";
            }else{
                result="ok word";}
        }else if(word.length()<3){
                result="too short";
            }if(word.length()>3){
                result="too long";
            }


        System.out.println(result);
    }
    }

