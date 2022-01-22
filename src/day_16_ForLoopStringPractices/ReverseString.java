package day_16_ForLoopStringPractices;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word here");

        String word = scan.nextLine();
        String result = ""; //contain reverse version of the string

        for (int i =word.length()-1; i >= 0 ; i--) {//i=index numbers of word
            result += word.charAt(i);

        }
        System.out.println(result);
    }
}
