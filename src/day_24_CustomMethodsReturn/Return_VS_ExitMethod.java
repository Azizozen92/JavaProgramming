package day_24_CustomMethodsReturn;

public class Return_VS_ExitMethod {
    public static void main(String[] args) {
        monthOfTheYear(50);
        System.out.println("Hello World");
    }

    public static void monthOfTheYear(int numberOfMonth) {

        String result = "";
        if(numberOfMonth < 1 || numberOfMonth > 12 ){
            System.out.println("Invalid");
            System.exit(0);
        }
        switch (numberOfMonth) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "Invalid Month";

        }
        System.out.println(result);
    }
}
