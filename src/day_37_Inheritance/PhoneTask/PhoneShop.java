package day_37_Inheritance.PhoneTask;

import day_36_Inheritance.DinnerTasks.PhoneTask.Iphone;

public class PhoneShop {

    public static void main(String[] args) {

        iPhone iphone = new iPhone("Iphone12","6.7 inches",1000,"black");

        Samsung samsung = new Samsung("galaxy S19","6 inches",900,"White");

        Nokia nokia = new Nokia("Brick","4 inches",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(84798478);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("-----------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("-----------------------------------");

        nokia.call(673254736);
        nokia.text(3847387);
        nokia.selfDefense();

        System.out.println("-------------------------");

        System.out.println(iPhone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);







    }
}
