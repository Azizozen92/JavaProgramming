package day_11_Switch_Scanner;
import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        input.close();
        String result="";
        switch ( (age >= 1 && age <= 2)?1:
        (age >= 3 && age <= 5)?2:
        (age >= 10 && age <= 12)?4:
        (age >= 13 && age <= 17)?5:
        (age >= 18 && age <= 20)?6:
        (age >= 21 && age <= 39)?7:
        (age >= 40 && age <= 49)?8:
        (age >= 50 && age <= 54)?9:
        (age >= 55 && age <= 64)?10:
        (age >= 65 && age <= 74)?11:
        (age >= 75 && age <= 84)?12:13 ) {
            case 1:
                result="Infant";
                break;
            case 2:
                result="Toddler";
                break;
            case 3:
                result="Kid";
                break;
            case 4:
                result="Pre-Teen";
                break;
            case 5:
                result="Teenager";
                break;
            case 6:
                result="Young Adult";
                break;
            case 7:
                result="Adult";
                break;
            case 8:
                result="Young Middle-Aged Adult";
                break;
            case 9:
                result="Middle-Aged Adult";
                break;
            case 10:
                result="Very Young Senior Citizen";
                break;
            case 11:
                result="Young Senior Citizen";
                break;
            case 12:
                result="Senior Citizen";
                break;
            default:
                result="Old Senior Citizen";
        }
        System.out.println(result);
    }
}



