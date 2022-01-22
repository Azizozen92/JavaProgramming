package day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultidimensionalArrays2 {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        int result = 0;
        for (int i = arr2D.length - 1; i >= 0; i--) {//i index of each 1 dimensional array starting
            //from last index~0
            for (int j = 0; j < arr2D[i].length; j++) {//j is index number of elements
                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("-----------------------");

        for (int i = 0; i < arr2D.length; i++) {//i is index numbers of arrays
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("--------------------------------");
        for (int i = arr2D.length - 1; i >= 0; i--) {//i index of each 1 dimensional array starting
            //from last index~0
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}