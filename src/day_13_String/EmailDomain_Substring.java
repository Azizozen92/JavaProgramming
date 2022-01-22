package day_13_String;



public class EmailDomain_Substring {
    public static void main(String[] args) {

        ;
        String email= "Cydeo.School@gmail.com";
        String email2= email.substring(email.indexOf("@")+1,email.indexOf(".c"));
        System.out.println(email2);

        System.out.println("------------------------------");
       String str1 = "Java is fun, Java is cool, I love Java";
       String s1= str1.substring(0,10+1);
       System.out.println(s1);

        int beg = str1.indexOf(" J")+1;
        int end = str1.lastIndexOf(",");
        String s2= str1.substring(beg,end);
        System.out.println(s2);

        int beg1 = str1.indexOf("I");
        String s3=str1.substring(beg1);
        System.out.println(s3);

    }
}
