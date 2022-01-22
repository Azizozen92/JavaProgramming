package day07_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 65,
                weeklyHours = 40;
        double  stateTax = 0,
                federalTax = 26.2,
                salaryBeforeTax= hourlyRate*weeklyHours*52,
                stateTax$= salaryBeforeTax*stateTax/100,
                federalTax$ = salaryBeforeTax*federalTax/100,
                totalTax$ = stateTax$+federalTax$,
                salaryAfterTax$=salaryBeforeTax-totalTax$;

        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("Federal tax is: $"+federalTax$);
        System.out.println("State tax is: $"+stateTax$);
        System.out.println("Total tax is: $"+totalTax$);
        System.out.println("Net income is: $"+salaryAfterTax$);
    }
}
