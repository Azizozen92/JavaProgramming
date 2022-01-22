package day_39_Recap.DeviceTask;

public class MyDevices {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("12",800);
        System.out.println(iphone);

        Samsung samsung = new Samsung("Galaxy",750);
        System.out.println(samsung);

        TV tv = new TV("Samsung","Optimus",1000,false,true);
        System.out.println(tv);

        Blackberry blackberry = new Blackberry("Pearl",400);
        System.out.println(blackberry);

        Google google = new Google("G3",700);
        System.out.println(google);

        Nokia nokia = new Nokia("Takoz",1);
        System.out.println(nokia);

        PersonalComputer pc = new PersonalComputer("Apple","Macbook Pro",1000,true);
        System.out.println(pc);

        Desktop desktop = new Desktop("Apple","MacHome",1300);
        System.out.println(desktop);

        Laptop laptop = new Laptop("Apple","Pro",800);
        System.out.println(laptop);


    }
}
