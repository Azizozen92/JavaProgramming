package day_24_CustomMethodsReturn;

import java.util.Arrays;

public class Tasks2345 {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6};
        int [] array2={7,8,9,10,11,12};

        int max=maxNumber(array);
        System.out.println("Maximum number: "+max);

        int min=minNumber(array);
        System.out.println("Minimum number: " +min);

        int reversedArray[]= reverseArray(array);
        System.out.println(Arrays.toString(reversedArray));

        int[]mergedArrays=  mergeArrays(array,array2);
        System.out.println(Arrays.toString(mergedArrays));


    }
    public static int maxNumber(int[]numbers){
        int max = numbers[0];

        //fori for loop shortcut, forr for reverse
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]>max){//if theres an element in the array thats greater that teh current max number
                max=numbers[i];//assigning greater number to max
            }
        }
        return max;
    }
    public static int minNumber(int[]numbers){
        int min = numbers[0];//100

        for (int i = 0; i < numbers.length; i++) {

            if(min>numbers[i]){
                min=numbers[i];
            }

        }
        return min;
    }
    public static int[] reverseArray(int[]numbers){
        int[] reversenumbers=new int [numbers.length];
        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            reversenumbers[j] = numbers[i];

    }
        return reversenumbers;
}
    public static int[] mergeArrays(int[]array1,int[]array2){
        int[] mergedArrays=new int [array1.length+array2.length];
        int i = 0;
        for (int each : array1) {
            mergedArrays[i++] = each;
        }

        for (int each : array2) {
            mergedArrays[i++]=each;
        }
        return mergedArrays;
    }
}
