package day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class DinnerTask2 {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        String result1 = "";
        String result2 = "";
        String result3 = "";

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                result1 += items[i][j] + "\t";
            }
            result1 += "\n";

            for (int j = items[i].length - 1; j >= 0; j--) {
                result2 += items[i][j] + "\t";
            }
            result2 += "\n";

            for(int j = 0; j<items[(items.length-1)-i].length; j++){
                result3+=items[(items.length-1)-i][j]+"\t";
            }
            result3 += "\n";

        System.out.println(result1);
        System.out.println("-----------------------------");
        System.out.println(result2);
        System.out.println("-----------------------------");
        System.out.println(result3);


    }
}
}











    
