package day_13_String;

import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Word Here");
        String word = scan.nextLine();
        int first = word.charAt(word.length()-1);
        int second = word.charAt(word.length()-2);
        String result = "";
        if(first=='y'&&second=='l'){
            result = "really???";
        }else {
            result="never mind";
        }
        System.out.println(result);
    }
}
