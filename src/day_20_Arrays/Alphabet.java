package day_20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        //create array that can contain 26 characters

        char[] character = new char[26]; // print Z~A

        char start='Z';//90

        /*for (int i = 0; i <character.length; i++) {
            character[i]=start--; this is one method

        }*/
        for (char i = 0, j='Z'; i< character.length;i++,j--){
            character[i]=j;// this is another method
        }
        System.out.println(character[2]);

            System.out.println(Arrays.toString(character));
    }
}
