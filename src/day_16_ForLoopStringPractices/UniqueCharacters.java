package day_16_ForLoopStringPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word = "aaabccc";
        String result ="";

        for (int i = 0; i <= word.length()-1 ; i++) {
            String ch = "" + word.charAt(i);

            if (word.indexOf(ch) == word.lastIndexOf(ch)) {
                result+=ch;
            }
        }
            System.out.println(result);

        }
    }

