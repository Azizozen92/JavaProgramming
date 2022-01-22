package day_18_NestedLoop;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int king = 120;
        int queen= 100;
        int single= 80;
        int total=0;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter room type");
            String room = scan.next().toLowerCase();

            while(!(room.equals("king") || room.equals("queen") || room.equals("single"))){
                System.err.println("Invalid Entry, Please re-enter your bed choice");
                room = scan.next().toLowerCase();}

                System.out.println("How many nights would you like to stay");

            int nights = scan.nextInt();

            while (!(nights>0)){
                System.err.println("Invalid entry, please re-enter number of nights");
                nights= scan.nextInt();
            }
            total += room.equals("king")? nights * 120: room.equals("queen")?
                    nights*100:nights*80;
            System.out.println("Would you like to reserve another room");
            String answer = scan.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid Answer please enter again");
                answer= scan.next();}
                if (!(answer.equals("yes"))){
                    break;
                }
            }
            System.out.println("total = " + total);



                }
            }




