package day_17_WhileAndDoWhileLoops;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {
            if(i== 'C' ){
                continue;
            }
            System.out.println(i);


        }
        System.out.println("-----------------------------");
        for (int i = 1; i <= 10; i++) {
            if(!(i%2==0)){
                continue;
            }
            System.out.println(i);

            System.out.println("------------------------------");



        }for (int j = 1; j <= 10; j++) {
            if(j%2==0){
                continue;
            }
            System.out.println(j);
    }
}}
