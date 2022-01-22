package day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinimum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] number = new int[10];

        int max= -2147483648;
        int min = 2147483647;

        for (int i = 0; i < number.length; i++) {

            System.out.println("Enter number");
            number[i] = scan.nextInt();


            if(number[i]>max){//if the user entered number is greater than current max number
            max=number[i];}

            if(number[i]<min){
            min = number[i];

            }

            }
            System.out.println("max: "+max);
            System.out.println("min:"+min);

    }
}
