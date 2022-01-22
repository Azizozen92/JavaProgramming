package day_16_ForLoopStringPractices;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Word Here");
        String word = scan.next().toLowerCase();
        String result = "";

        for (int i =word.length()-1; i >=0 ; i--) {

            result += word.charAt(i);
        // boolean palindrome = word.equals(result) shorter way of doing it
          }if(word.equals(result)){
            System.out.println("Palindrome");
        }  else{
            System.out.println("Not Palindrome");


        }

    }
}
