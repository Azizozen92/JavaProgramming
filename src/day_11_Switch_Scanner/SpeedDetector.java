package day_11_Switch_Scanner;

import java.util.Scanner;

public class SpeedDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed");
        int speedLimit=55;
        int currentSpeed= scan.nextInt();
        String result="";
        int milesOver=currentSpeed-speedLimit;
        if (currentSpeed>speedLimit){
            result="you are driving "+milesOver+" mph over the limit.Slow down!";
            System.out.println(result);
        }

        /*2. Write a program for the speed check. a variable named speedLimit
         is given and assigned, ask user to enter the current speed, if the current
          speed is over the speedLimit print slow down, otherwise do not print anything
         */

    }
}
