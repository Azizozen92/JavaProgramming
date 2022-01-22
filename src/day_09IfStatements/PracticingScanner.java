package day_09IfStatements;

import java.util.Scanner;

public class PracticingScanner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Seconds:");
        int inputSeconds = userInput.nextInt();
        int time = inputSeconds*55;
        System.out.println(time);
    }

}
