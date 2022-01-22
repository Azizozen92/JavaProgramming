package day_21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[] classMates = {"Jesus Sedano", "George Elias", "Amin Nasirov", "Kristina Edeman", "Layan Assim", "Maria Meeks",
                "Maxim Zabalotnykh", "Alejandra Hernandez", "Ayanle FarSah"};
        for (String names : classMates) {
            System.out.println(""+names.charAt(0) +"."+ names.charAt(names.indexOf(" ")+1));
        }
    }
}
