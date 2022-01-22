package Unit4PracticeTest;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> strs= new ArrayList<>();


        strs.add("j");//j
        strs.add(0, "1"); //1j
        strs.add("i");//1ji
        strs.add(2,"5");//1j5i
        strs.remove(1);//15i
        strs.add("e");//15ie
        strs.add("i");//15iei
        strs.remove("i");//15ei    will remove first i


        System.out.println(strs);
    }

}
