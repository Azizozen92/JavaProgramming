package day_28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {

        String password = "WoodenSpoon123!";

        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int specialChars = 0;

        for (int i = 0; i < password.length(); i++) {

            char ch =  password.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCase++;}
            if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
            if (Character.isDigit(ch)) {
                digits++;
            }
            if (!Character.isLetterOrDigit(ch)) {
                specialChars++;

            }
        }
        if (password.length()>=8 && !password.contains(" ") && upperCase>=1 && lowerCase>=1 && digits>=1 && specialChars>=1){
            System.out.println(password+" is a strong password");
        } else {
            System.err.println(password+" is not a strong password");
        }
    }
    //Muhtars way of doing it
    public static boolean isStrongPassword(String password){

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; //has lower case
        boolean r4 = false; //has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {

            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else{ // special char
                r4 = true;
            }
            /* if you want to exit loop after all conditions are true
            if(r2 && r3 && r4 && r5){
                break;
            }*/
        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }


}
