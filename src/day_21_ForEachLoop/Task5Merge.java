package day_21_ForEachLoop;

import java.util.Arrays;

public class Task5Merge {
    public static void main(String[] args) {
        int[] arr1 ={30, 10, 20};
        int[] arr2= {15, 40, 25, 35};
        int[] arr3= {8, 9, 17, 5, 4, 1};
        int[] total =new int[arr1.length + arr2.length + arr3.length];

        int count =0;

        for (int i : arr1) {
            total[count++]=i;
        }
        for (int i : arr2) {
            total[count++]=i;
        }
        for (int i : arr3) {
            total[count++]=i;
        }
        System.out.println(Arrays.toString(total));


    }


}
