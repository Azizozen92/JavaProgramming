package day_13_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //substring(beginning index, ending index)
        String word="Cydeo School";
        //           012345..
        String brand=word.substring(0,4+1);
        String brand2=word.substring(word.indexOf("C"),word.indexOf(" "));
        System.out.println(brand);//Cydeo
        System.out.println(brand2);//Cydeo


        String str1= word.substring(6);
        String str2= word.substring(word.indexOf("S"));

        System.out.println(str1);//Schools
        System.out.println(str2);

        String word2 = "Python C# Ruby";
        String s1=word2.substring(0,word.indexOf(" ")+1);
        String s2=word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        String s3=word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
