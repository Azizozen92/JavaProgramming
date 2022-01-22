package day_15_ForLoop;

import java.util.Scanner;

public class ReplaceX2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String word1= word.replaceFirst("x","a")
                .replaceFirst("X","a");
        System.out.println(word1);

    }
}
