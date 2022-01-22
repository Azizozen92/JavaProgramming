package day_21_ForEachLoop;

import java.util.Arrays;

public class ReverseName {
    public static void main(String[] args) {
        String[] classMates = {"Jesus Sedano", "George Elias", "Amin Nasirov", "Kristina Edeman", "Layan Assim", "Maria Meeks",
                "Maxim Zabalotnykh", "Alejandra Hernandez", "Ayanle FarSah"};

        for (String names : classMates) {
          String reversed="";
            for (int i = names.length()-1; i >=0 ; i--) {
               reversed += names.charAt(i);

            }
            System.out.println(reversed);
        }

    }
}
