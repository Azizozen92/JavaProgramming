package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthsLargestNumber {
    public static void main(String[] args) {
        int a=3;
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        for (int i = 0; i < a-1; i++) {
            list.removeIf(p-> Collections.max(list)==p);
        }

        int max=Collections.max(list);
        System.out.println(max);

    }
}
