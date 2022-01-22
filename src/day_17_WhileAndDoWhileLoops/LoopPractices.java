package day_17_WhileAndDoWhileLoops;

public class LoopPractices {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------");
        int num=1;
        while((num<=10)){

            System.out.println(num);
            num++;

        }

        System.out.println("-------------");

        int num1 = 1;

        do{
            System.out.println(num1);
            num1++;
        }while(num1 < 10);
        System.out.println(num1);
    }
}
