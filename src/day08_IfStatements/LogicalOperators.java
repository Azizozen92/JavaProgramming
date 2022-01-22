package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 34;
        String citizen = "North Korea";
        String name = "Aaron";
        boolean isEligibleOrNot= age>18 && citizen== "USA";
        System.out.println(name + " is eligible to vote:"+isEligibleOrNot);


        System.out.println("------------------------");
        String name2="Josh";
        int creditScore = 800,
                age2 = 42,
                income = 65000;

        boolean eligibleForLoan = creditScore>=700&&age2>=21 && income>=60000;

        System.out.println(name+" is eligible for loan: "+eligibleForLoan);
        System.out.println("---------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isELigible3 = age>=18 && (gender=='M'||gender=='F');
        System.out.println(name3+" is eligible to register: "+isELigible3);
        System.out.println("--------------------------------------");

        String name4= "James",
         countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;
        boolean isEligible4= countryOfBirth=="USA" || marriedToUSCitizen==true;
        System.out.println(name4+" is eligible to apply for US citizenship: "+isEligible4);
        System.out.println("------------------------------");
        String student = "Holly";

        double gpa=2.5;
        int familyIncome = 50000;
        boolean isEligible5 = familyIncome<60000 || gpa>=3.5;
        System.out.println( student+" is eligible for scholarship: "+isEligible5);
        System.out.println("---------------------------------");
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);
        System.out.println("----------------------");
        int score= 85;
        boolean pass = score>=60;
        boolean failed = !pass;
        System.out.println("pass = " + pass);
        System.out.println("failed = " + failed);






    }
}
