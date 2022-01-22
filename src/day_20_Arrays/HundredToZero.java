package day_20_Arrays;

import java.util.Arrays;

public class HundredToZero {
    public static void main(String[] args) {
        int[]num = new int[100];
        for (int i = num.length; i >= 1 ; i--) {
            num[num.length-i]= i;

        }
        System.out.println(Arrays.toString(num));
    }
}
