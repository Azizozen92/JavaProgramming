package day_20_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};

        for (int j = 0; j <words.length; j++) {

            String element = words[j];
            int frequency = 0;

            for (int i = 0; i < words.length; i++) {//finds frequency of element from array
                if (words[i].equals(element)) {
                    frequency++;
                }
            }
            if (frequency == 1){
                System.out.println(element);
            }
        }

    }
}