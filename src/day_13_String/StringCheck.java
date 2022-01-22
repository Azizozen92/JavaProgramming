package day_13_String;


import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter any phrase or number: ");
        String str1 = scan.nextLine();

        if (str1.length()==0){
            System.out.println("String is empty");
        }else if (str1.length()<=3){
            System.out.println(str1);
        }else{
            System.out.println(""+(str1.charAt(str1.length()-1))+(str1.charAt(str1.length()-2))+(str1.charAt(str1.length()-3)));
        }
        scan.close();
    }
}
