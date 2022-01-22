package day_20_Arrays;

public class Task1Initials {
    public static void main(String[] args) {
        String[] classMates = {"Jesus Sedano", "George Elias", "Amin Nasirov", "Kristina Edeman", "Layan Assim", "Maria Meeks",
                "Maxim Zabalotnykh", "Alejandra Hernandez", "Ayanle FarSah", "Douglas Lister"};
        for (int i = 0; i < classMates.length; i++) {
            String initial = classMates[i];
            System.out.println(""+initial.charAt(0)+initial.charAt(initial.indexOf(' ') + 1));



    }


    }

}
