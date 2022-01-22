package day_24_CustomMethodsReturn;

public class Test {
    public static void main(String[] args) {

        String str ="aaaaaaaaaabbbbbbbbbbbbbbbb";
        str=ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);

        String name="Java Programming";
        String reversed= ReturnMethodIntro.reverse(name);
        System.out.println(reversed);
    }
}
