package day_20_Arrays;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {
        //store ten elements: 10, 20, 50, 70
        int[] elements={10,20,50,70};//size is 4
        System.out.println(Arrays.toString(elements));

        System.out.println("-----------------------------");
        //create a variable that can contain 5 scores
        int[]scores = new int[5];//null
        scores[0]=65;
        scores[1]=85;
        scores[scores.length-1]=95;
        scores[3]=75;
        scores[2]=55;
        System.out.println(Arrays.toString(scores));

        String[] months= {"January","February","March","April","May",
                "June","July","August","September","October","November",
                "December"};//index # 0~months.length-1

        int num = 3;
        if(num<1 && num>12){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        for (int i = 0; i < months.length; i++) {

            System.out.println(months[i]);
        }
        System.out.println("------------------------------");

        for (int i = months.length-1; i >= 0 ; i--) {//i represents index
            //numbers of array backwards
            System.out.println(months[i]);

        }








    }
}
