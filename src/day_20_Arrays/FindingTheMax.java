package day_20_Arrays;

public class FindingTheMax {
    public static void main(String[] args) {
        int[] numbers ={10,5,4,20,1,0};
        int max = numbers[0];

        //fori for loop shortcut, forr for reverse
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]>max){//if theres an element in the array thats greater that teh current max number
                max=numbers[i];//assigning greater number to max
            }
        }
        System.out.println(max);
        }
    }

