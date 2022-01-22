package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PracticeMyself2 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));
        System.out.println(scores);

        int aCount=0, bCount=0, cCount=0,dCount=0,fCount=0;
        for (Integer score : scores) {
            if(score<=100){
                if(score >= 90){
                    aCount++;
                }else if(score >= 80){
                    bCount++;
                }else if(score >= 70){
                    cCount++;
                }else if(score >= 60){
                    dCount++;
                }else{
                    fCount++;
                }
                }
            }
        System.out.println("A's = " + aCount);
        System.out.println("B's = " + bCount);
        System.out.println("C's = " + cCount);
        System.out.println("D's = " + dCount);
        System.out.println("F's = " + fCount);




        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,100,100,200,50,150,10,20,30,40,50,60,70));
        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);

        int a=Collections.max(numbers);
        int b=Collections.min(numbers);
        System.out.println(a);
        System.out.println(b);
        int frequecy=Collections.frequency(numbers,100);
        System.out.println(frequecy);
        }



        }


