package day_25_CustomMethod_Overloading;

public class LunchTaskMaxNumbers {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 12, -1};
        int max = maxNumber(array);
        System.out.println(max);

        System.out.println("---------------------");

        double[] array2={1.0,3.0,2.0};
        double max2 = maxNumber(array2);
        System.out.println(max2);

        System.out.println("-----------------------");

        long[]array3={34,56,83,90};
        long max3=maxNumber(array3);
        System.out.println(max3);

        System.out.println("--------------------------");

        short[]array4={3,67,12,45,23};
        short max4 = maxNumber(array4);
        System.out.println(max4);

        System.out.println("-----------------------------");

        float[]array5={45,56,12,45,78};
        float max5=maxNumber(array5);
        System.out.println(max5);

        System.out.println("---------------------------");

        byte[] array6={1,2,4,3,5,89};
        byte max6=maxNumber(array6);
        System.out.println(max6);
        
    }

    public static int maxNumber(int[] array) {
        int max = array[0];
        for (int number : array) {

            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double maxNumber(double[] array) {
        double max = array[0];
        for (double number : array) {

            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static long maxNumber(long[] array) {
        long max = array[0];
        for (long number : array) {

            if (number > max) {
                max = number;
            }
        }
        return max;
}
    public static short maxNumber(short[] array) {
        short max = array[0];
        for (short number : array) {

            if (number > max) {
                max = number;
            }
        }
        return max;
}
    public static float maxNumber(float[] array) {
        float max = array[0];
        for (float number : array) {

            if (number > max) {
                max = number;
            }
        }
        return max;
}
    public static byte maxNumber(byte[] array) {
        byte max = array[0];
        for (byte number : array) {

            if (number > max) {
                max = number;
            }
        }
        return max;
}}