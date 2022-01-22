package day_11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 12;
        String result ="";
        int year =2000;

        if (month >= 1 && month <= 12) {
            switch (month){
                case 2:
                    if (year%4==0){
                        result = (year%4 ==0)?"29 days":"28 days";
                        break;
                    }

                    result="28 days";
                    break;
                case 9: case 4: case 6: case 11:
                    result="30 days";
                    break;
                default://1,3,5,7,8,10,12
                    result="31 days";
                            break;
            }

        }else{
            result="invalid number";

        }
        System.out.println(result);
        }
    }

