package day08_IfStatements;

public class Cigarettes {
    public static void main(String[] args) {
        int age = 32;
        boolean eligibleToBuyCigarettes= age>=21;
        boolean notEligible = age<21;
        if (eligibleToBuyCigarettes){
            System.out.println("Can Buy Cigarettes");

        }
        if(notEligible){
            System.out.println("Can Not Buy Cigarettes");
        }
    }
}
