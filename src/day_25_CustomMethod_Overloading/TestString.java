package day_25_CustomMethod_Overloading;

import utilities.StringUtility;

public class TestString {

    public static void main(String[] args) {

        String str="Java Programming Language";
        StringUtility.printEachChar(str);

        System.out.println("------------------------------");

        String str1="Cydeo School";
        str1=StringUtility.reverse(str1);
        System.out.println(str1);

        System.out.println("-------------------------------");

        String word ="java";
        boolean Palindrome=StringUtility.isPalindrome("civic");
        System.out.println("Palindrome = " + Palindrome);

        System.out.println("-------------------------------");

        String[] names={"Anna", "Java", "Python","Racecar","Mom","Cydeo"};
        int count=0;
        for (String name : names) {
            if(StringUtility.isPalindrome(name)){
                count++;
            }
        }System.out.println(count);

        System.out.println("----------------------");

        String s2 = "aaaaaaabbbbbbbbbbbbbbbbbcccddddd";
        s2=StringUtility.removeDuplicates(s2);
        System.out.println(s2);


    }

}
