package day_10NestedIf;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salaryBeforeTax = 134000;
        boolean ifMarried = true;
        double afterTax;

        if(ifMarried){
            if(salaryBeforeTax>=130000){
                afterTax=salaryBeforeTax-(salaryBeforeTax*.30);
            }else if (salaryBeforeTax<=129999&&salaryBeforeTax>100000){
                afterTax=salaryBeforeTax-(salaryBeforeTax*.25);
            }else if (salaryBeforeTax<=99999&&salaryBeforeTax>=80000){
                afterTax=salaryBeforeTax-(salaryBeforeTax*.20);
            }else {
                afterTax=salaryBeforeTax-(salaryBeforeTax*.15);
            }
        }else if(salaryBeforeTax>=130000){
            afterTax=salaryBeforeTax-(salaryBeforeTax*.35);
        }else if (salaryBeforeTax<=129999&&salaryBeforeTax>100000){
            afterTax=salaryBeforeTax-(salaryBeforeTax*.30);
        }else if (salaryBeforeTax<=99999&&salaryBeforeTax>=80000){
            afterTax=salaryBeforeTax-(salaryBeforeTax*.25);
        }else {
            afterTax=salaryBeforeTax-(salaryBeforeTax*.20);

        }
        System.out.println(afterTax);

    }
}
