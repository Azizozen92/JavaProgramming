package Unit4PracticeTest;

public class Test13 {

    public static void main(String[] args) {

        String str= method7( "during class",20);
        System.out.println(str);

    }

    public static String method7(String str, int s){

        str= str.substring(6);
        if(s<10){
            str.substring(8);
        }else{

            if(str.length()>s){
                str="Not during class";

            }else if(s>10 || s== -10){
                str= str.substring(5);
            }
        }

        return str;
    }
}
