package day_24_CustomMethodsReturn;

public class LunchTasks {
    public static void main(String[] args) {
        uniqueCharacter("aaabbbcccdeeef");
        uniqueElements(new int[]{1,2,2,3,3,4,4,5});
    }
    public static void uniqueCharacter(String word){

        String result="";

        for (int j = 0; j < word.length(); j++) {
            char ch =word.charAt(j);
            int count=0;

            for (int i = 0; i < word.length(); i++) {
                char eachCharacter = word.charAt(i);
                if (ch == eachCharacter){
                    count++;
                }
            }
            if (count==1){
                result += ch+" ";
            }
        }
        System.out.println(result);

            }
    public static void uniqueElements(int[]words){

        for (int j = 0; j <words.length; j++) {

            int element = words[j];
            int frequency = 0;

            for (int i = 0; i < words.length; i++) {//finds frequency of element from array
                if (words[i] == (element)) {
                    frequency++;
                }
            }
            if (frequency == 1){
                System.out.println(element);

                }

        }}}

