package day_20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //create a variable that is capable enough to contain 5 names
        String[] myGroup = new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";

        //System.out.println(myGroup);// will give you hashcode
        System.out.println(Arrays.toString(myGroup));//correct way of using array

        System.out.println("-----------------------");

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 5;
        if(number<1 && number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};

        int num = 3;
        if(num<1 && num>12){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(months[num-1]);

    }
}
