package day_11_Switch_Scanner;

import java.util.Scanner;

public class PeopleYouLiveWith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of ppl");
        int amtOfPpl= scan.nextInt();
        String result = "";
        if (amtOfPpl>0){
      result=  (amtOfPpl>=1&&amtOfPpl<=3)?"Live with less than 3 people":
         (amtOfPpl>=3&&amtOfPpl<=6)?"Live with 3-6 people":"live with more than 6 people";
        }else{
            result="Invalid Number";
        }
        System.out.println(result);


        //Ask the user how many people they live with:
        //            if user lives with Less than 3 people: print "Live with less than 3 people"
        //            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
        //            if the user lives with more than 6 people: print "Live with "more than 6 people"

    }
}
