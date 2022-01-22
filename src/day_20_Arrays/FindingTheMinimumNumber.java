package day_20_Arrays;

public class FindingTheMinimumNumber {
    public static void main(String[] args) {

        int[] numbers={100, 500, 30, 40, 600, 80, -90};
        int min = numbers[0];//100

        for (int i = 0; i < numbers.length; i++) {

            if(min>numbers[i]){
                min=numbers[i];
            }

        }
        System.out.println(min);


    }
}
