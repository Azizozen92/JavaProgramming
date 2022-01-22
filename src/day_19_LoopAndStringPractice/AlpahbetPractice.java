package day_19_LoopAndStringPractice;

public class AlpahbetPractice {
    public static void main(String[] args) {
        String result ="";
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                result=""+i+""+j+" ";
                System.out.print(result);
            }
            System.out.println();
        }
        }

    }

