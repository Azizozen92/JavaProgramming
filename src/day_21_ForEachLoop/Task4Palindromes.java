package day_21_ForEachLoop;

public class Task4Palindromes {
    public static void main(String[] args) {
        String[] names = {"anna", "level", "Java","racecar",};

        int count=0;
        for (String each : names) {
            String reverse="";
         for(int i=each.length()-1; i>=0; i--){
             reverse+=each.charAt(i);
             if(reverse.equals(each)){
                 System.out.println(each);
                 count++;
             }

         }
        }
        System.out.println(count);



    }
}
