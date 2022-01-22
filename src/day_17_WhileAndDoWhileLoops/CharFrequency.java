package day_17_WhileAndDoWhileLoops;

public class CharFrequency {
    public static void main(String[] args) {

        String word = "AAABBBCAAABBBCCCCDDDD";
        char chr = 'B';

        int count =0;

        for (int i = word.length()-1; i >=0 ; i--) {//i ran it backwards lol

           char eachChar = word.charAt(i);

            if (chr==eachChar){
                count++;
            }

        }
        System.out.println(count);
    }
}
