package day_15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input");
        String word = scan.next();
        String word1="";
        if(word.charAt(0) == 'x'){
            word1= word.replaceFirst("x","a");
        }
        System.out.println(word1);
    }}


