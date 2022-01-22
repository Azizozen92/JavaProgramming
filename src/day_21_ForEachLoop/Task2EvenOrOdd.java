package day_21_ForEachLoop;

public class Task2EvenOrOdd {
    public static void main(String[] args) {
        int[] array = {1, 2, 10, 4, 5, 6, 7, 8};
        int odd=0;
        int even=0;
        for (int i : array) {
            if(i % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }
}
