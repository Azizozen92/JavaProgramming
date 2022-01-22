package day_20_Arrays;

import java.util.Arrays;

public class OnetoHundred {
    public static void main(String[] args) {
        int[]num = new int[100];

        for (int i = 0; i <= num.length-1; i++) {
            num[i]=i+1;

        }
        System.out.println(Arrays.toString(num));
    }
}
