package day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Aaron", "Shay", "Brenna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};

        String [][] groups= new String[3][];//index: 0,1,2
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

       // System.out.println(Arrays.toString(groups));//toString method is for one dimensional array only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("------------------------------------");
        /*
        {1,2,3}
        {5,6,7}
        {8,9,10,11,12}
                         0 1  2    0 1 2    0  1  2   3   4     */
        int[][]arr2D= {{1, 2, 3}, {4,5,6,7}, {8, 9, 10, 11, 12,}};
        //              index:0    index:1   index:2
        System.out.println(Arrays.toString(arr2D[1]));//4,5,6,7
        System.out.println(arr2D[2][3]);//11
        for (int i : arr2D[1]) {
            System.out.println();
        }
     }
}
