package day_16_ForLoopStringPractices;

public class Dinner2 {
    public static void main(String[] args) {
        String str = "aabccccccccccccdd";
        char chr = 'c';
        int count =1;
        String result="";
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='c'){
                result =""+ count++;
            }
        }
        System.out.println(result);
    }
}
