package day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class Breakfast1ReverseSentence {
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";
        String[] newSentence= sentence.split(" ");
        System.out.println(Arrays.toString(newSentence));

        String result ="";

        for (int i = newSentence.length - 1; i >= 0; i--) {
        result+=newSentence[i]+" ";

        }
        System.out.println(result);
    }
}
