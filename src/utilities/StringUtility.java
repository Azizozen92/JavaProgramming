package utilities;

import java.util.Arrays;

public class StringUtility {

    //Prints each characters of a given String
    public static void printEachChar(String word){

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }


    }

    //reverses the given string and returns reversed
    public static String reverse(String str){
        String reverse="";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    //check if the String is palindrome,returns boolean
    public static boolean isPalindrome(String str){
       return reverse(str).equalsIgnoreCase(str);

    }

    //checks to see if 2 words are anagram, returns boolean
    public static boolean isAnagram(String str1,String str2){
        char [] ch1 = str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);


        return Arrays.equals(ch1,ch2);
    }


    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result += each;
            }

        }

          return result;
        }


    }


