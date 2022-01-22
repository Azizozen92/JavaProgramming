package day_22_MultiDimensionalArrays;

public class MinAndMax {
    public static void main(String[] args) {
        int[][] numbers ={{-14,2,3,4},{5,6,7,8,9},{10,27}};
        int max=-2100000000;
        int min=2147483647;

        for (int[] eachArray : numbers) {

            for (int element : eachArray) {

                if(element>max){
                    max=element;

                }if (element<min){
                    min=element;
                }
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
