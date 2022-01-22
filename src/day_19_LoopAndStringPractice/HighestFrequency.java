package day_19_LoopAndStringPractice;

public class HighestFrequency {
    public static void main(String[] args) {
        String str = "aabbbcccddddlllpppppppppppp";
        int highestFrequency=0;
        String result ="";

        for(int i=0; i<str.length(); i++) {

            char s1 = str.charAt(i);
            int count = 0;

            for(int j = 0; j<str.length(); j++) {
                char s2 = str.charAt(j);

                if(s1==s2) {
                    count++;
                }
            }
            if(count>=highestFrequency) {

               highestFrequency=count;
                result = ""+ str.charAt(i);
            }
        }
        System.out.println(result);
    }


}

