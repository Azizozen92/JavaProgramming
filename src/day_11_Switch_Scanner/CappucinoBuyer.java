package day_11_Switch_Scanner;

public class CappucinoBuyer {
    public static void main(String[] args) {
        String cupSize = "venti";
        String result ="";
        switch (cupSize){
            case "tall":
               result=" price is $3.69\n 90calories" ;
               break;
            case "grande":
                result=" price is $3.99;\n 120calories";
                break;
            case "venti":
                result=" price is $4.29\n 150 calories";
                break;
            default:
                result="invalid size";
        }
        System.out.println(result);
    }
}
