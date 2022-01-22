package day_13_String;

import java.util.Scanner;

public class Bonus3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word here");
        String word = scan.next();
        int word1 = word.charAt(0);
        String word2= word.substring(1);
        if(word1=='x'){
            System.out.println(word2);
        }
        /*Ask user to enter a word. If the work starts with x,
        print the word without x.
                    Input:
                        xcode
                    Output:
                        code
                        */

    }
}
