package day08_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {
int num = 2;
boolean firstDay = num==1,
        secondDay = num==2,
        thirdDay = num ==3,
        fourthDay = num ==4,
        fifthDay = num ==5,
        sixthDay = num == 6,
        seventhDay = num == 7;
        if(firstDay){
            System.out.println("Monday");
        }
        if (secondDay){
            System.out.println("Tuesday");
        }
        if (thirdDay){
            System.out.println("Wednesday");
        }
        if (fourthDay){
            System.out.println("Thursday");
        }
        if (fifthDay){
            System.out.println("Friday");
        }
        if (sixthDay){
            System.out.println("Saturday");
        }
        if(seventhDay)
            System.out.println("Sunday");
    }
}
