package day_24_CustomMethodsReturn;

public class ReturnMethodPractice {

    public static void main(String[] args) {

       int maxNumber = max(50,134);
        System.out.println(maxNumber);
        int multiplication= maxNumber * 2 ;
        System.out.println(multiplication);

    }
    public static int max(int num,int num2){
    int result=0;
    if(num > num2){
        result=num;

    }else{
        result=num2;
    }
    return result;
    }
}
