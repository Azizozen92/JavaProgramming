package utilities;

import day_34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiersTest2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData);//default is not available in another package
        //System.out.println(AccessModifiers.privateData);//private is not accessible beyond own class

        AccessModifiers.method1();
        //AccessModifiers.method2();default only available in package
        //AccessModifiers.method3();privaate only available in class
    }
}


class D{
    
}
