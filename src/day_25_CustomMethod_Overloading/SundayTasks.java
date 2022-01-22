package day_25_CustomMethod_Overloading;

import java.util.Arrays;

public class SundayTasks {
    public static void main(String[] args) {
        String sentence = "Java java java python python".toLowerCase();
        String word = "java";
        int wordFrequency =frequencyOfWord(sentence,word);
        System.out.println(wordFrequency);
        System.out.println("-----------------------------------");

        boolean anagram= anagram("cba","bac");
        System.out.println(anagram);
        System.out.println("-------------------------------------");

        String reverse=reverse("aziz");
        System.out.println(reverse);

        boolean palindrome= palindrome("level");
        System.out.println(palindrome);
        System.out.println("-------------------------------------------");
        int [] array= {1,1,1,2,3,4,5,6};
        int count =elementFrequency(array,1);
        System.out.println(count);

    }
    public static int frequencyOfWord(String sentence, String word){
        int wordCount = 0;
        while (sentence.contains(word.toLowerCase())) {
            sentence = sentence.replaceFirst(word, "");
            wordCount++;
        }
        return wordCount;
    }
    public static boolean anagram(String word1, String word2){
        char[] newWord1 = word1.toCharArray();
        char[] newWord2=word2.toCharArray();

        Arrays.sort(newWord1);
        Arrays.sort(newWord2);

        boolean equal =Arrays.equals(newWord1,newWord2);
        return equal;
    }
    public static String reverse(String word){
        String reverse="";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse +=word.charAt(i);

        }
        return reverse;
    }
    public static boolean palindrome(String word){
        String result1 ="";
        String result2="";
        for (int i = 0; i < word.length(); i++) {
            result1+=word.charAt(i);
        }
        for (int i = word.length()-1; i >= 0 ; i--) {
            result2+=word.charAt(i);
        }
        boolean palindrome= result1.equals(result2);
        return palindrome;
    }
    public static int elementFrequency(int[]array,int number){
        int count=0;
        for (int i : array) {
            if (i==number){
                count++;
            }
        }
        return count;
    }
}
