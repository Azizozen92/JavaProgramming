package day_13_String;

public class InitialsWCapitalLetters {
    public static void main(String[] args) {
        String first = "cybertek";
        String last = "school";
        first=first.toUpperCase();
        last = last.toUpperCase();
        char f = first.charAt(0);
        char l = last.charAt(0);
        System.out.println(f+"."+l);


    }
}
