package day_27_WrapperClasees;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str= "123";

        int num = Integer.parseInt(str);//int

        System.out.println(num+1);//124
        System.out.println(str+1);//1231

        String str2 ="10.5";
        double num2=Double.parseDouble(str2);
        System.out.println(num2);//10.5
        System.out.println(num2+1);//11.5

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println(max);//2147483647
        System.out.println(min);//-2147483648

        long max1=Long.MAX_VALUE;
        long min1=Long.MIN_VALUE;
        System.out.println(max1);//9223372036854775807
        System.out.println(min1);//-9223372036854775808

        String s1 ="false";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);


        System.out.println("----------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2);//Integer
        int y = x;
        System.out.println(x);
        System.out.println(y);

        String s3 ="1.5";
        Double z= Double.valueOf(s3);

        System.out.println(z);

        System.out.println("-----------------------------------------------");

        //isDigit()
        char ch1 = '0';
        boolean r2=Character.isDigit(ch1);
        System.out.println(r2);//true
        
        //isLetter
        boolean r3=Character.isLetter(ch1);
        System.out.println(r3);//false
        
        //special char
        char ch2='!';
        boolean r4=!Character.isLetterOrDigit(ch2);
        System.out.println(r4);//true
        
        //upperCase
        boolean r5 = Character.isUpperCase(ch1);
        System.out.println(r5);
        
        //lowerCase
        boolean r6= Character.isLowerCase(ch1);
        System.out.println(r6);

        System.out.println("---------------------------------");
        
        String s = "ab1cde2efg3hi4";
        int sum=0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum);








    }
}
