package day_20_Arrays;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] reversenumbers=new int [numbers.length];
        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
             reversenumbers[j] = numbers[i];

        }
        System.out.println(Arrays.toString(reversenumbers));

    }
}
