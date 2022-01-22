package day_20_Arrays;

import java.util.Scanner;

public class AverageNumbersOfArray {
    public static void main(String[] args) {



        int[] numbers = {10, 20, 30, 40, 50, 60};
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Average number:"+sum/numbers.length);
    }
}
