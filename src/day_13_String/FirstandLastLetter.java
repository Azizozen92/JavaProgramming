package day_13_String;



public class FirstandLastLetter {
    public static void main(String[] args) {
        String sentence= "I am going to kill it today";
        int totalCharacters= sentence.length();

        char firstW = sentence.charAt(0);
        char lastW = sentence.charAt((sentence.length()-1));
        String firstAndLast= ""+firstW+lastW;
        System.out.println(firstAndLast);


    }
}
