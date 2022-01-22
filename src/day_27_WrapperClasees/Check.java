package day_27_WrapperClasees;
import java.util.Scanner;
public class Check {



        public static void main(String[] args) {

                System.out.println("Enter a new password");
                String password = new Scanner(System.in).nextLine();
                int upperCase=0, lowerCase=0, digits=0, specialChars=0;
                for (int i = 0; i < password.length(); i++) {
                    char ch =  password.charAt(i);
                    if (Character.isUpperCase(ch)) upperCase++;
                    else if (Character.isLowerCase(ch)) lowerCase++;
                    else if (Character.isDigit(ch)) digits++;
                    else specialChars++;
                }
                if (password.length()>=8 && !password.contains(" ") && upperCase>=1 && lowerCase>=1 && digits>=1 && specialChars>=1){
                    System.out.println(password+" is valid password type");
                } else {
                    System.err.println(password+" is not a valid password type");
                }
        }}
