package day_18_NestedLoop;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {


        String word= "aaabbcccccccbddddddccccccccc";
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        String character="";

        for (int i = 0; i < word.length(); i++) {


            for (int j = 0; j < 1; j++) {
                character=""+word.charAt(i);

                if (character.equals("a")){
                    countA++;
                }else if(character.equals("b")){
                    countB++;
                }else if (character.equals("c")){
                    countC++;
                }else if(character.equals("d")){
                    countD++;
                }



            }
        }System.out.print("a"+ countA);
        System.out.print("b"+countB);
        System.out.print("c"+countC);
        System.out.print("d"+countD);
    }
}
