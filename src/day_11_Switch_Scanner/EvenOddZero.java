package day_11_Switch_Scanner;

import java.util.Scanner;

public class EvenOddZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String result="";
        if(num==1){
            result="positive";
        }if(num==-6){
            result="negative";
        }if(num==0){
            result="zero";
        }System.out.println(result);
    }
}
