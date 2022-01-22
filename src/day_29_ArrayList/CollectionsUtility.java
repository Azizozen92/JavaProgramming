package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Character>list2=new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("-----------------------------------");

        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list3,1,4);
        System.out.println(list3);

        System.out.println("--------------------------------------");
        int max=Collections.max(list3);
        int min = Collections.min(list3);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        System.out.println("--------------------------------------");

        ArrayList<Integer> list4 =new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        Collections.replaceAll(list4,10,1000);
        System.out.println(list4);
        System.out.println("-----------------------");
        int count=Collections.frequency(list4,1000);
        System.out.println(count);
        System.out.println("-----------------------");
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python","Python","Ruby","C#"));
        int count1=Collections.frequency(words,"Java");
        int count2=Collections.frequency(words,"Python");
        boolean same=count1==count2;
        System.out.println(same);
    }
}
