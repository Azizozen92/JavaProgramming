package day_10NestedIf;

public class Finra {
    public static void main(String[] args) {
        int num1 = 9;
        String result = "";
        if (num1%3==0&num1%5==0){
            result="FINRA";
        }else if(num1%3==0){
            result ="FIN";
        }else if(num1%5==0){
            result = "RA";
        }else{
            result= "Invalid";
        }
        System.out.println(result);
    }
}
