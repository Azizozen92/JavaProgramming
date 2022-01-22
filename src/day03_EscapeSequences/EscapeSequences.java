package day03_EscapeSequences;
/*
escape sequences: MUST be given within double quote
\n: to start a new line
\t: to create "tab" space
\\: to create one back slash since back slash is reserved for escape sequence
/": to create double quote
*/
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");
        System.out.println("------------------------");
        System.out.println("Hello Cydeo \nHow are you all today? \nIts nice to see you all! \nWhat class do we have next week?");
        System.out.println("------------------------------------------");
        System.out.println("\tJava is Cool Programming Language");
        System.out.println("------------------------");
        System.out.println("/ \\");// in order to print one back slash you need x2
        System.out.println("---------------------------------");
        System.out.println("My favorite Tv show is \"Game of Thrones\"");


    }

}
