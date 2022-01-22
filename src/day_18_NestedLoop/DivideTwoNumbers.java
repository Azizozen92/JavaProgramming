package day_18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a = 24, b = 6;

        int result=1;
        while(a>=6){
            a-=b;
            result++;
        }
        System.out.println(result+" with a remainder of "+a);
    }
}
