package Unit4PracticeTest;

public class Phone {

    static int number;

    public Phone(String str) {

        this(str.length());// 1 plus string length
    }

    public Phone(int num) {

        this();
        number += num;
    }

    public Phone() {
        number += 1;

    }
}
class CallPhones{

    public static void main(String[] args) {

        new Phone("Iphone");//7 1+6(
        new Phone();//8 7+1
        new Phone(4);//13 8+1+4
        System.out.println(Phone.number);


    }
}
