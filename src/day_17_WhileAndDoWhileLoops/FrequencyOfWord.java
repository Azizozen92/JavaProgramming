package day_17_WhileAndDoWhileLoops;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String word = "Cat Cat Dog Dog".toLowerCase();
        int frequency = 0;

        for (int i = 0; i < word.length()-2; i++) {
           String eachSubstring= word.substring(i,i+3);

            if(eachSubstring.equals("cat")){
                frequency++;
            }
        }
        System.out.println(frequency);



    }
}
