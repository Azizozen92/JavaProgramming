package day_13_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word here");
        String word1= scan.next();
        System.out.println("Enter second word here");
        String word2= scan.next();
        System.out.println("Enter third word here");
        String word3 = scan.next();
        int l1=word1.length();
        int l2=word2.length();
        int l3=word3.length();
        String result="";
        if(l1==l2&&l2==l3){
            result="All words are the same length";
        }else if((l1 != l2 && l1 != l3 && l2 != l3 )){
            result="All different lengths";
        }else{
            result="Not same nor different lengths";
        }
        System.out.println(result);

        }
    }

