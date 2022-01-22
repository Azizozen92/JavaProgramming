package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Abdulaziz";
        String lastName = " Ozen";
        int age = 29;
        String jobTitle = "Server";
        String companyName = "Uchi";
        String fullName = firstName + " " +lastName;
        double salary = 120000.58;

        System.out.println("Full name of the person is " + fullName + " is " +age+" years old");
        System.out.println(fullName+" is " + age + " years old");
        System.out.println(fullName +" is "+"a " +jobTitle +" works at " +
                ""+companyName+" salary is $"+salary );
    }
}
//full name of person