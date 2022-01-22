package day_20_Arrays;

import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {
        int[] numbers = {0,5,2,6,10,0,0};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int [] reversed= new int[numbers.length];
        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            reversed[j]=numbers[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
