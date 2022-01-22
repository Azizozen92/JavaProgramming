package day_35_Encapsulation.DinnerTasks;

import day_35_Encapsulation.DinnerTasks.Candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        Candy candy1 = new Candy("Reeses",2,1.5,true);
        Candy candy2 = new Candy("KitKat",3,1.25,false);
        Candy candy3 = new Candy("Snickers",1,1.4,true);
        Candy candy4 = new Candy("Hersheys",4,1.8,false);
        Candy candy5 = new Candy("Twix",4,0,false);

        ArrayList<Candy>candies=new ArrayList<>();
        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy eachCandy : candies) {
            System.out.println(eachCandy.getBrand()+" : "+eachCandy.getPrice());
        }



    }
}
