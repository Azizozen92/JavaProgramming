package day_10NestedIf;

public class Loans {
    public static void main(String[] args) {
        int salary = 70000;
        int creditScore = 651;
        String result ="";
        result=(salary>60000&&creditScore>650)?"Loan Approved":"Loan Not Approved";
        System.out.println(result);
        //6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.
        //
        //                To be approve for the loan, print: "Loan Approved":
        //                        Salary: above 60,000
        //                        Credit Score: above 650
        //
        //                    Otherwise print: "Loan Denied"
        //
        //              NOTE: MUST USE TERNARY.
    }
}
