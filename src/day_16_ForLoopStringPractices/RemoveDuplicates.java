package day_16_ForLoopStringPractices;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String word ="aabbaacc";
        String result = "";

        for (int i = 0; i <=word.length()-1 ; i++) { //i: represents the index number starting from 0
            String ch = ""+word.charAt(i);

            if(!result.contains(ch)){
                result += ch;
            }

        }System.out.println(result);
    }
}
