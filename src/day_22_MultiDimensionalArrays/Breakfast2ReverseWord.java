package day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class Breakfast2ReverseWord {
    public static void main(String[] args) {


        String sentence = "I love Java";
        String[] sentence1 = sentence.split(" ");
        String reverse = "";

        for (int i = sentence1[1].length() - 1; i >= 0; i--) {
            reverse+=""+sentence1[1].charAt(i);

        }
        sentence=sentence.replaceFirst(sentence1[1],reverse);
        System.out.println(sentence);
        sentence1[1]=reverse;
        System.out.println(Arrays.toString(sentence1));
        for (String result : sentence1) {
            System.out.print(result+" ");
        }
    }
}