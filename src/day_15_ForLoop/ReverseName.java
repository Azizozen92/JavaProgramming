package day_15_ForLoop;

import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word here");
        String word = scan.nextLine().toLowerCase();
        String result ="";
        for (int i =word.length()-1; i >=0 ; i--) {
            result += word.charAt(i);

        }
        System.out.println(result);

    }
}
