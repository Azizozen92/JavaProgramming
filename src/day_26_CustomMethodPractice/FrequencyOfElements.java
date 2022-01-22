package day_26_CustomMethodPractice;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arrays={1,2,3,1,1};
        int count=frequencyOfElement(arrays,1);
        System.out.println(count);
    }

    //returns frequency of element from int array
    public static int frequencyOfElement(int[]array,int element){
        int count =0;
        for (int each : array){
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns frequency of element from double array
    public static int frequencyOfElement(double[]array,double element){
        int count =0;
        for (double each : array){
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns frequency of element from char array
    public static int frequencyOfElement(char[]array,char element){
        int count =0;
        for (char each : array){
            if(each == element){
                count++;
            }
        }
        return count;
    }

    //returns frequency of element from String array
    public static int frequencyOfElement(String[]array,String element){
        int count =0;
        for (String each : array){
            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }


}
