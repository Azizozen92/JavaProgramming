package Unit4PracticeTest;

public class Main {


    static{
        System.out.print(0);//1

    }

    static void run(){

        System.out.print(1);
    }

    public static void main(String[] args) {
        System.out.print(2);//3

        run();//4
    }
    static{
        System.out.print(3);//2
        //0321
    }
}
