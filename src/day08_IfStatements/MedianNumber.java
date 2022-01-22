package day08_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        //Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
        //
        //            Ex:
        //                a = 10, b= 15, c = 20;
        //
        //            Output:
        //                15 is the median number
        int a =3,
            b = 1,
            c = 2;
        boolean isTheMedian = (a>b && a<c) || (a > c && a <b);//i wrote boolean expressions as an extra step
        boolean isTheMedian2 = (b>c && b<a)||(b>a&& b <c);//extra step
        boolean isTheMedian3 = !isTheMedian && !isTheMedian2;
        if (isTheMedian){
            System.out.println(a+" is the median number");
        }
        if(isTheMedian2){
            System.out.println(b+" is the median number");
        }
        if (isTheMedian3){
            System.out.println(c+" is the median number");
        }
    }
}
