package day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class DinnerTask1Reverse {
    public static void main(String[] args) {
        int[][] array= {{1,2,3},{4,5,6}};
        int[][] reversed = new int[array[1].length-1][array[0].length];

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            for (int k = array[i].length-1,l=0; k>=0; k--,l++ ){
                reversed[j][l]=array[i][k];
            }
        }
        System.out.println(Arrays.deepToString(reversed));

            }
        }




