package day_09IfStatements;

public class PassOrFail {
    public static void main(String[] args) {
        int score = 75;
        //System.out.println("Congrats you passed");
        //System.out.println("Failed");
        boolean passOrFail= score>=60;//extra step for boolean [practice
        if(score>=60){
            System.out.println("Congrats you passed");
        }else{
            System.out.println("Failed");

        }

    }
}
