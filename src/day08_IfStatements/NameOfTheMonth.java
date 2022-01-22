package day08_IfStatements;

public class NameOfTheMonth {
    public static void main(String[] args) {
        //1. Create a class called NameOfTheMonth, write a program that can display the name of the month
        //
        //            number = 1 ~ 12
        int month = 11;
        boolean firstMonth = month==1;
        boolean secondMonth = month==2;
        boolean thirdMonth = month==3;
        boolean forthMonth = month == 4;
        boolean fifthMonth = month == 5;
        boolean sixthMonth = month == 6;
        boolean seventhMonth = month ==7;
        boolean eighthMonth = month == 8;
        boolean ninthMonth = month==9;
        boolean tenthMonth = month==10;
        boolean eleventhMonth= month==11;
        boolean twelfthMonth= month == 12;
        if (firstMonth){
            System.out.println("January");
        }
        if(secondMonth) {
            System.out.println("February");
        }
        if(thirdMonth){
            System.out.println("March");
        }
        if (forthMonth){
            System.out.println("April");
        }
        if(fifthMonth){
            System.out.println("May");

        }
        if (sixthMonth){
            System.out.println("June");
        }
        if (seventhMonth){
            System.out.println("July");
        }
        if (eighthMonth){
            System.out.println("August");
        }
        if (ninthMonth){
            System.out.println("September");
        }
        if (tenthMonth){
            System.out.println("October");
        }
        if(eleventhMonth){
            System.out.println("November");
        if (twelfthMonth){
            System.out.println("December");
        }
        }
    }
}
