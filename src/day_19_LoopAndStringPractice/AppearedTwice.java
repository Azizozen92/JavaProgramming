package day_19_LoopAndStringPractice;

public class AppearedTwice {
    public static void main(String[] args) {
        String str = "aabbccdd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch =str.charAt(j);
            int count=0;//represents the frequency of the variable

            for (int i = 0; i < str.length(); i++) {//compares the character that
                //outer looped picked with each character of the string "str"
                char eachCharacter = str.charAt(i);
                if (ch == eachCharacter){
                    count++;
                }

            }
            if (count==2){//if the frequency is unique
                result+=ch;

            }
        }
        System.out.println(result);

    }
}
