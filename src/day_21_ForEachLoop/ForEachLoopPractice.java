package day_21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String[] words = {"Java Program", "Cydeo School", "Wooden Spoon","Early Birds","Angry Birds"};
        for (String word : words) {
            System.out.println(word.charAt(0)+""+ word.charAt(word.length()-1));
        }


    }
}
