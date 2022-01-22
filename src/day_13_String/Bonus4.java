package day_13_String;

import java.util.Scanner;

public class Bonus4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word here");
        String word1 = scan.next();
        int lastLetter=word1.charAt(word1.length()-1);

        System.out.println("Enter second word here");
        String word2 = scan.next();
        int firstLetter=word2.charAt(0);
        String word3= word2.substring(1);
        String result="";
        if(lastLetter==firstLetter){
            result=""+word1+word3;
        }else {
            result=""+word1+word2;
        }
        System.out.println(result);








        /*
        Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the
    last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
         */
    }
}
