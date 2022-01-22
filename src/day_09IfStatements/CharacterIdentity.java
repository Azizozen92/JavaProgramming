package day_09IfStatements;

public class CharacterIdentity {
    public static void main(String[] args) {
        // For capital alphabets 65 – 90  // A ~ Z
        //        For small alphabets 97 – 122   // 97 ~ 122
        //        For digits 48 – 57
        char character = '@';
        if ((character>=65 && character<=90)|| ( character>=97 &&character<=122)){
            System.out.println("Alphabetic Character");
        }else if(character>=48&&character<=57){
            System.out.println("Digit Character");
        }else{
            System.out.println("Special Character");
        }
    }
}
