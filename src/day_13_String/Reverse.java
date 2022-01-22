package day_13_String;


import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter fucking word here");
        String word= scan.next();
        int length = word.length();
        char first = word.charAt(0);
        char second= word.charAt(1);
        char third = word.charAt(2);
        char fourth = word.charAt(3);
        char fifth= word.charAt(4);
        String result = "";
        if(length==5){
            result=""+fifth+fourth+third+second+first;
        }else if (length>5){
            result="result is too long";
        }else{
            result= "result is too short";
        }
        System.out.println(result);
    }
}
