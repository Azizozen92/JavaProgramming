package day_13_String;

import java.util.Scanner;

public class Bonus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word here");
        String word1 = scan.nextLine();
        String word2= word1.replace("a","");

        System.out.println("Enter second word here");
        String word3 = scan.nextLine();
        String word4 = word3.replace("b","");

        System.out.println(word2+word4);
        /*Ask user to enter two words. Print first word without
        its first character
        then print the second word without its first character.
                Input:
        apple
                banana
        Output:
        ppleanana*/
    }
}
