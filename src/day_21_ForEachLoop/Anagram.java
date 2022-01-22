package day_21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb", str2="dbca";
        //write a program can check if str1&str2 are build out of same character

        char[] word= str1.toCharArray();
        char[] word2 =str2.toCharArray();

        Arrays.sort(word);
        Arrays.sort(word2);

        System.out.println(Arrays.toString(word));
        System.out.println(Arrays.toString(word2));

        boolean equal =Arrays.equals(word,word2);

        System.out.println(equal);

        System.out.println("------------------------------");

        String sentence = "Wooden Spoon";

        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String email = "WoodenSpoon@cydeo.com";
        String[] name = email.split("@");
        System.out.println(Arrays.toString(name));

        System.out.println("-------------------------");

        String s = "Today is a nice day. Today is Monday. Today we learn Java";
        String[] sentences = s.split("\\. ");
        System.out.println(Arrays.toString(sentences));


    }
}
