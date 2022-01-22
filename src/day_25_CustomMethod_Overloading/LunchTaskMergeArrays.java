package day_25_CustomMethod_Overloading;

import java.util.Arrays;

public class LunchTaskMergeArrays {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        int[]arr2={6,7,8,9,10};
        int[]merged=merge(arr1,arr2);
        System.out.println(Arrays.toString(merged));
        System.out.println("--------------------------------");
        double[] arr3={1.0,2.0,3.0,4.0};
        double[] arr4={5.0,6.0,7.0,8.0};
        double[]merged2=merge(arr3,arr4);
        System.out.println(Arrays.toString(merged2));
        System.out.println("---------------------------------");
        char[]arr5={'A','B','C'};
        char[]arr6={'D','E','F'};
        char[] merged3=merge(arr5,arr6);
        System.out.println(Arrays.toString(merged3));
        System.out.println("----------------------------------");
        String[]arr7={"Aziz","Ozen"};
        String[]arr8={"Turkish","Delight"};
        String[]merged4=merge(arr7,arr8);
        System.out.println(Arrays.toString(merged4));
        
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int[]total=new int[arr1.length+arr2.length];
        int count = 0;

        for (int i : arr1) {
            total[count++] = i;
        }
        for (int i : arr2) {
            total[count++] = i;
        }
        return total;
    }
    public static double[] merge(double[] arr1, double[] arr2) {

        double[]total=new double[arr1.length+arr2.length];
        int count = 0;

        for (double i : arr1) {
            total[count++] = i;
        }
        for (double i : arr2) {
            total[count++] = i;
        }
        return total;
}
    public static char[] merge(char[] arr1, char[] arr2) {

        char[]total=new char[arr1.length+arr2.length];
        int count = 0;

        for (char i : arr1) {
            total[count++] = i;
        }
        for (char i : arr2) {
            total[count++] = i;
        }
        return total;
}public static String[] merge(String[] arr1, String[] arr2) {

        String[]total=new String[arr1.length+arr2.length];
        int count = 0;

        for (String i : arr1) {
            total[count++] = i;
        }
        for (String i : arr2) {
            total[count++] = i;
        }
        return total;
}}