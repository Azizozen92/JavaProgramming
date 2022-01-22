package day_11_Switch_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Grade Here");
        int score = input.nextInt();
        String result="";
        if (score>=0&&score<=100){
        result=    (score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D"
             :"D";
        }else {
            result="Invalid Score";
        }
        System.out.println(result);
        input.close();

    }
}
