package day_13_String;

public class CheckingLetters {
    public static void main(String[] args) {
        String word = "level";
        char first= word.charAt(0);
        char last = word.charAt(4);
        String result="";
        if(first==last){
            result="same";
        }else{
            result="not same";
        }
        System.out.println(result);

        }
    }

