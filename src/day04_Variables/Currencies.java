package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        //convert $1000 into different currencies

        int dollar = 1000;
        double lira = dollar * 9.8;
        double euro = dollar * 0.86;
        double jpy = dollar * 115.0;
        double pound = dollar * 0.73;
        double peso = dollar * 20.87;
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("peso = " + peso);
        //jpy, pound, peso, cad, riyal
    }
}
