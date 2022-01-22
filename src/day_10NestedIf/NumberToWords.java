package day_10NestedIf;

public class NumberToWords {
    public static void main(String[] args) {
        int num =5;
    String result="";
    if(num>=0&&num<=9){
       result= (num==0)?"Zero":(num==1)?"One":(num==2)?"Two":(num==3)?"Three":(num==4)?"Four":(num==5)
         ?"Five":(num==6)?"Six":(num==7)?"Seven":(num==8)?"Eight":"Nine";
    }else {
        result="Invalid Range";
    }
        System.out.println(result);
}}
