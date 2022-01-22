package day_25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int[] array= {1,2,3,4};
        array = addInteger(array,5);
        System.out.println(Arrays.toString(array));

        System.out.println("---------------------------------------");

        double[] array2 ={1.5,2.5,3.5,4.5};
        array2=addDouble(array2,5.5);
        System.out.println(Arrays.toString(array2));

        System.out.println("------------------------------------");

        String[] names={"Tatiana", "Oleksandr", "Cassandra", "Ali"};//Add Neira
        names=addString(names,"Neira");
        names=addString(names,"Igor");
        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------------");

        char[]chars={'A','B','C','D'};
        chars=addChar(chars,'E');
        System.out.println(Arrays.toString(chars));
    }
    public static int[] addInteger(int[]array,int element){

        int[] result= new int [array.length+1];
        int i=0;

        for (int each : array) {
           result[i++] =each;
        }
        result[result.length-1]=element;
        return result;
    }
    public static double[] addDouble(double[]array,double element){

        double[] result= new double [array.length+1];
        int i=0;

        for (double each : array) {
            result[i++] =each;
        }
        result[result.length-1]=element;
        return result;

}
    public static String[] addString(String[]array,String element){

        String[] result= new String [array.length+1];
        int i=0;

        for (String each : array) {
            result[i++] =each;
        }
        result[result.length-1]=element;
        return result;
    }
    public static char[] addChar(char[]array,char element){

        char[] result= new char [array.length+1];
        int i=0;

        for (char each : array) {
            result[i++] =each;
        }
        result[result.length-1]=element;
        return result;


    }}


