package day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class OddOrEven {
    public static void main(String[] args) {

        int[][] numbers ={{1,2,3,4},{5,6,7,8,9},{10,11}};
        int oddCount=0;
        int evenCount=0;
        for (int[] eachArray : numbers) {
            //System.out.println(Arrays.toString(eachArray));
            for (int eachElement : eachArray) {
                if(eachElement%2==0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
            System.out.println("evenCount = " + evenCount);
            System.out.println("oddCount = " + oddCount);
        }

    }
}
