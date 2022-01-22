package day_16_ForLoopStringPractices;

import java.util.Scanner;

public class Dinner1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        int neu =0;
        String result= "";

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter number");
            int num = scan.nextInt();

            if (num > 0){
              pos =++pos;
            }else if(num<0){
                neg=++neg;
            }else{

            }

        }
        System.out.println(pos+" positive and "+neg+" negative");

    }
}
