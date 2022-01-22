package day_26_CustomMethodPractice;

import java.util.Arrays;

public class RemovedElements1 {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500, 600};
        numbers = removeElements1(numbers, 1);
        numbers = removeElements1(numbers, 1);
        System.out.println(Arrays.toString(numbers));
    }


    //retruns new array after removing element
    public static int[] removeElements1(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];

        }
        return result;
    }

    //returns new arrat after removing element
    public static double[] removeElements1(double[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];

        }
        return result;
    }

    //returns new array after removing element
    public static char[] removeElements1(char[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];

        }
        return result;


    }
    //returns new arrat after removing element
    public static String[] removeElements1(String[]array,int index){
        if(index <0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        String[] result =new String[array.length-1];

        for (int i = 0,j=0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];

        }
        return result;
}

}




