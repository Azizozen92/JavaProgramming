package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of int array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }


    //prints each double of array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }


    //prints each char of a charArray in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }


    }


    //prints each String of stringArray
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }

    }

    // returns max value from int array
    public static int maximumNumber(int[] array) {


        Arrays.sort(array);
        return array[array.length - 1];


    }

    //returns max from double array
    public static double maximumNumber(double[] array) {


        Arrays.sort(array);
        return array[array.length - 1];

    }

    //returns min value from Array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns min from double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];


    }

    //checks if the integer is contained in the given array
    public static boolean contains(int[] array, int element) {

        boolean result = false;
        for (int i : array) {
            if (i == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the double is contained in the given array. returns boolean
    public static boolean contains(double[] array, double element) {

        boolean result = false;
        for (double i : array) {
            if (i == element) {
                result = true;
            }
        }
        return result;


    }

    //check if the char is contained in the given array. returns boolean
    public static boolean contains(char[] array, char element) {

        boolean result = false;
        for (char i : array) {
            if (i == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the String is contained in the given array
    public static boolean contains(String[] array, String element) {

        boolean result = false;
        for (String i : array) {
            if (i.equals(element)) {
                result = true;
            }
        }
        return result;


    }

    //adds element into int array
    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];
        int i = 0;

        for (int each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;
        return result;
    }

    //adds element into double array
    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];
        int i = 0;

        for (double each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;
        return result;

    }

    //adds element into String array
    public static String[] addElement(String[] array, String element) {

        String[] result = new String[array.length + 1];
        int i = 0;

        for (String each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;
        return result;
    }

    //adds element into char array
    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];
        int i = 0;

        for (char each : array) {
            result[i++] = each;
        }
        result[result.length - 1] = element;
        return result;

    }

    //returns frequency of element from int array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //returns frequency of element from double array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //returns frequency of element from char array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //returns frequency of element from String array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};
        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //returns unique elements of the double array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};
        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;

    }

    //returns unique Elements from char array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};
        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;

    }

    //returns unique elements from String array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};
        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;

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

    //returns new array after removing element
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

    //returns new array after removing element
    public static String[] removeElements1(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];

        }
        return result;
    }

    //merges 2 double arrays and returns new one
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;

    }

    //merges 2 char arrays and returns new one
    public static char[] merge(char[] arr1, char[] arr2) {

        char[] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;

    }

    //merges 2 int arrays and returns new one
    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;

    }

    //merges 2 String arrays and returns new one
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;

    }

    //reverses int array returns new one
    public static int[] reverse(int[] array) {

        int[] reverse = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    //reverse double array and returns new one
    public static double[] reverse(double[] array) {

        double[] reverse = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    //reverse char array and returns new one
    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    //reverse String arrat and retruns new one
    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    //remove duplicates from array using add and contains method
    public static int[] removeDuplicates(int[] numbers) {
        int[] result = {};
        for (int each : numbers) {

            if (!contains(result, each)) {

                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    
    //remove duplicates from double array and returns new one
    public static double[] removeDuplicates(double[] numbers) {
        double[] result = {};
        for (double each : numbers) {

            if (!contains(result, each)) {

                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes duplicates from char Array and returns new one
    public static char[] removeDuplicates(char[] numbers) {
        char[] result = {};
        for (char each : numbers) {

            if (!contains(result, each)) {

                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes duplicates from String Array and returns new one
    public static String[] removeDuplicates(String[] numbers) {
        String[] result = {};
        for (String each : numbers) {

            if (!contains(result, each)) {

                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //replaces index with new element in int array
    public static int[] replace(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces index with new element in double array
    public static double[] replace(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces index with new element in char array
    public static char[] replace(char[] array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replaces index with new element is String array
    public static String[] replace(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    //replaces old element value with new one in int array
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    //replaces old element value with new one in double array
    public static double[] replaceAll(double[] array, double oldElement, double newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    //replcaes old element value with new one in char array
    public static char[] replaceAll(char[]array,char oldElement,char newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    //replaces old element value with new one in String array
    public static String[] replaceAll(String[]array,String oldElement,String newElement){
        for (int i = 0; i < array.length; i++){
            if(array[i].equals(oldElement) ){
                array[i] = newElement;
            }
        }return array;
}






}


