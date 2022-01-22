package day_16_ForLoopStringPractices;

public class Dinner4 {
    public static void main(String[] args) {
        String sentence = "Java Java Java Robot Robot Java";

        int result = 0;

        for (int i = 0; i <= sentence.length()-4; i++) {

            String word = sentence.substring(i, i + 4);

            if (word.equals("Java")){
                result = result + 1;
            }

        }
        System.out.println(result);


    }
}
