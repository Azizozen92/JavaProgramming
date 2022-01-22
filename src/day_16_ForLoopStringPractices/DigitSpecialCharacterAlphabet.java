package day_16_ForLoopStringPractices;

public class DigitSpecialCharacterAlphabet {
    public static void main(String[] args) {
        String word = "alskdfjhslifh29871   93827###@@@";
        
        String digits = "";
        String letters ="";
        String specialChars="";


        for (int i = 0; i <word.length() ; i++) {

            char chr = word.charAt(i);//chr: prints out every single character

            if(chr >= 48 && chr <= 57){
                digits +=chr;
            }else if(chr>= 'a' && chr<='z' || chr>='A' && chr<='Z'){
                letters +=chr;
            }else{
                if(chr != ' '){
                    specialChars+=chr;
                }

            }

            }
        System.out.println("letter: "+letters);
        System.out.println("special character: "+specialChars);
        System.out.println("digits: "+digits);


        }

    }

