package day_10NestedIf;

import javax.swing.*;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 95;
        if(score>=0&&score<=100) {//if the score is valid


            if (score >= 60) {//if student passed the exam
                System.out.println("Passed");
            } else {
                System.out.println("Failed");//if student failed the exam
            }
        }else{//if it is an invalid score
            System.out.println("Invalid Score");
    }
        System.out.println("--------------------------------");
        int age = 25;
        boolean hasId = true;
        if (hasId) {//if the person has ID

            if (age >= 21) {//if the person is 21 years or older
                System.out.println("Eligible to buy alcohol");
            } else {//if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }

        }else{//if the person doesnt have an ID
            System.out.println("You must have ID to buy alcohol");
        }
        System.out.println("------------------------");
        int number = 25;
        if (number>=1&&number<=7){
            if (number==1){
                System.out.println("Monday");
            }else if (number==2){
                System.out.println("Tuesday");
            }else if (number==3){
                System.out.println("Wednesday");
            }else if (number==4){
                System.out.println("Thursday");
            }else if (number==5){
                System.out.println("Friday");
            }else if (number==6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }
        }else{
            System.out.println("Invalid number");
        }







}
}
