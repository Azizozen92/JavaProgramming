package day_16_ForLoopStringPractices;

import java.util.Scanner;

public class Dinner5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter desired time of the words: \"cat\" and \"dog\"");
        String str = scan.nextLine();
        str = str.toLowerCase();
        int countCat =0;
        int countDog =0;


        for (int i = 0; i < str.length(); i++) {
            
            if(str.contains("dog")){
                str = str.replaceFirst("dog","");
                countDog++;

            }if (str.contains("cat")){
                str=str.replaceFirst("cat","");
                countCat++;
            }

        }
        if(countCat==countDog){
            System.out.println("true");
        }else{
            System.out.println("false");

            String valid = "";
    }}}

