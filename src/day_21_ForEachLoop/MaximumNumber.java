package day_21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers ={10,5,4,20,1,0};
        int max = numbers[0];
        for (int number : numbers){
            System.out.println(number);
            if(number>max){
                max=number;
            }
        }
        System.out.println(max);

        /*
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]>max){//if theres an element in the array thats greater that teh current max number
                max=numbers[i];//assigning greater number to max
            }
        }
        System.out.println(max);*/

    }
}
