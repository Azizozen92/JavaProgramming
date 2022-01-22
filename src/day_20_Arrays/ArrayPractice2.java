package day_20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];
        letters[0]='A';

        System.out.println(Arrays.toString(letters));//A~Z

       /* for (char i = 'A', j=0; i < 'Z' && j<letters.length; i++,j++) {// i is the index
            //numbers 0~last index
            letters[j]=i;

        }*/
        char ch ='A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]=ch++;

        }
        System.out.println(Arrays.toString(letters));

        System.out.println("----------------------------");

        char[] letters2= new char[26];

        char chr ='A';

        for (int i = 25 ; i >=0 ; i--) {
            letters2[i]=chr++;

        }System.out.println(Arrays.toString(letters2));




        }

    }

