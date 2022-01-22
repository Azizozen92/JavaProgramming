package day_15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str =" ";
        boolean r =str.isEmpty();//true or false
        System.out.println(r);

       boolean r1 = str.isBlank();//true or false
        System.out.println(r1);

        String str2 ="Cydeo    ";
        boolean r2 = str2.isBlank();//false

        System.out.println("---------------------------------");

        String s1 ="CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));//false

        System.out.println(s1.equalsIgnoreCase(s2));//true


        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("-----------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean does = sentence.contains("C#");//false
        boolean hasJava = sentence.contains("Java");//true
        boolean hasJava2 = sentence.contains("java");//false
        boolean hasJava3= sentence.toLowerCase().contains("java");

        System.out.println(does);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("-------------------------------");

        String input1 = "I love jAvA";
        String input2= "Java";

        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toUpperCase().contains("JAVA"));//true
        System.out.println("-----------------------------");

        String a = "Wooden Spoon";
        boolean word = a.startsWith("Woo");//true
        boolean word2 = a.endsWith("Spoon");
        boolean qord3 = a.toLowerCase().startsWith("wooden");//in order to create
        //the case sensitivity we first creat the lower case of upper case version
        //of string and then
        System.out.println(word);



    }
}
