package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PracticeMyself1 {
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);
        numbers.set(4,0);
        System.out.println(numbers);

        System.out.println("------------------------------------");

        ArrayList<Integer>numbers1=new ArrayList<>();
        numbers1.addAll(Arrays.asList(1,2,3,4,5));

        Collections.swap(numbers1,0,numbers1.size()-1);
        System.out.println(numbers1);
        System.out.println("-------------------------------------");

        ArrayList<Integer>numbers2=new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers2);
        for (int i = 0; i < numbers2.size(); i++) {

            if(numbers2.get(i)%2>0){
                numbers2.set(i,numbers2.get(i)*2);
            }
        }
        System.out.println(numbers2);


        System.out.println("------------------------------");
        String [] arr1 = {"A", "B", "C"};
        String [] arr2= {"D","E","F","G"};
        ArrayList<String>number=new ArrayList<>();
        for (String s : arr1) {
            number.addAll(Arrays.asList(s));
        }
        for (String s : arr2) {
            number.addAll(Arrays.asList(s));
        }
        System.out.println(number);
        }


    }

