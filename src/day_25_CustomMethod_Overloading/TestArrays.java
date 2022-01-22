package day_25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        ArraysUtility.printEachElement(array);

        System.out.println("-------------------------------");

        double[] array1 ={1.0, 2.0, 3.0, 4.0, 5.0 };
        ArraysUtility.printEachElement(array1);

        System.out.println("--------------------------------");

        char[] array3 ={'A', 'B', 'C','D','E'};
        ArraysUtility.printEachElement(array3);

        System.out.println("--------------------------------");

        String [] array4={"Aziz","Ozen","Turkish","Delight"};
        ArraysUtility.printEachElement(array4);

        System.out.println("--------------------------------");

        int [] arr1={1,2,3,72,5};
        int max=ArraysUtility.maximumNumber(arr1);
        System.out.println(max);

        System.out.println("---------------------------------");

        double [] arr2= {1.0,2.0,72.0,32.6};
        double max1 =ArraysUtility.maximumNumber(arr2);
        System.out.println(max1);

        System.out.println("----------------------------------");

        int[]a1={1,1,1,1,1,1,1,2,3,4,5,6,7};
        boolean contains=ArraysUtility.contains(a1,5);
        System.out.println(contains);

        a1=ArraysUtility.removeDuplicates(a1);
        System.out.println(Arrays.toString(a1));


    }
}
