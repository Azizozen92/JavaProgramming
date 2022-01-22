package day_13_String;

public class StringMethod_4 {
    public static void main(String[] args) {
        String str = "Cydeo ";

        String str2= str.repeat(4);//"CydeoCydeoCydeoCydeoCydeo"

        System.out.println(str2);

        String s1 = "Wooden Spoon";
        String s2= s1.repeat(100);
        System.out.println(s2);
        System.out.println("-------------------------");
        System.out.println("FADY\n".repeat(15));


        String name = "Java";
        String name2 = name.repeat(5);
        System.out.println((name+" ").repeat(5));


    }
}
