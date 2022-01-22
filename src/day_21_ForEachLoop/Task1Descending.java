package day_21_ForEachLoop;

import java.util.Arrays;

public class Task1Descending {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 7, 12, -3, 2 };
        int[] num = new int[numbers.length];

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            num[j]= numbers[i];
        }
        System.out.println(Arrays.toString(num));


    }
}
