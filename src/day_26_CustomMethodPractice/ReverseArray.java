package day_26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        array=reverse(array);
        System.out.println(Arrays.toString(array));
    }

    //reverses int array returns new one
    public static int[] reverse(int[] array){

        int[]reverse=new int [array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    //reverse double array and returns new one
    public static double[] reverse(double[] array){

        double[]reverse=new double [array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    //reverse char array and returns new one
    public static char[] reverse(char[] array){

        char[]reverse=new char [array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    //reverse String arrat and retruns new one
    public static String[] reverse(String[] array){

        String[]reverse=new String [array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

}
