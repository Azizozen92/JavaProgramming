package Unit4PracticeTest;

public class Test3 {

    public static void main(String[] args) {

        method2(" Java Programming is Awesome");
    }
    public static void method2(String s){

        String a= s.substring(10);

        if(a.length()> s.length()){

            System.out.println(a);
        }else{

            System.out.println(s);
        }
    }
}
