package day_21_ForEachLoop;

public class Task6WordCount {
    public static void main(String[] args) {


        String sentence ="Java Program Java Python Java Java Java Java Java Python ";
        String[] newSentence=sentence.split(" ");

        int javaCount=0;
        int pythonCount=0;

        for (String i : newSentence) {
            if(i.contains("Java")){
                javaCount++;
            }
            if (i.contains("Python")){
                pythonCount++;
            }
        }
        System.out.println("pythonCount = " + pythonCount);
        System.out.println("javaCount = " + javaCount);
    }
}