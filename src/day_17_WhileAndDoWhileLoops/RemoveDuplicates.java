package day_17_WhileAndDoWhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AABBBBBBBCCCCCDDDDEEEEFFGGG";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = ""+str.charAt(i);

            if(result.contains(ch)){
                continue;
            }
            result +=ch;
        }
        System.out.println(result);
        int a = 2;
        a = --a + a++ + a-- + a++;
        System.out.println(a);

    }
}
