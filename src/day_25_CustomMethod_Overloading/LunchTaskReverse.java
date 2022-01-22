package day_25_CustomMethod_Overloading;

import java.util.Arrays;

public class LunchTaskReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        array = reverse(array);
        System.out.println(Arrays.toString(array));

    }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static char[] reverse(char[] array) {
        char[] reverse = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }
}