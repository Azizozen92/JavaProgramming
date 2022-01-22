package day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {//i is the index numbers of list
            list.set(i, list.get(i)*2);
        }
        System.out.println(list);

        System.out.println("---------------------------------------");

        ArrayList<Character>characters= new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');//0
        int b = characters.lastIndexOf('A');//4

        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------------------------------");
        
        boolean r2 = characters.contains('A');//true
        
        boolean r3 = characters.contains('Z');//false

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-------------------------------");

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);// false
        System.out.println(list1.equals(list2));

        System.out.println("--------------------------------");

        list1.clear();
        boolean r4=list1.isEmpty();//false

        System.out.println("r4 = " + r4);


    }
}
