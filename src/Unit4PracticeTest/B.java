package Unit4PracticeTest;

public class B {

    static int count;

    public B(){

        count++;

    }

    public B(int i){

        count+= i;
    }

    public   B(String s){

        count+= s.length();
    }

}class Test {

    public static void main(String[] args) {


        new B();//1
        B a = new B();//2 1+1
        B a2 = new B("Java Programming");//18 2+16
        B a3 = new B(2);//20 2+18
        System.out.println(B.count);
    }
}
