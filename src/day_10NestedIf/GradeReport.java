package day_10NestedIf;

public class GradeReport {

    public static void main(String[] args) {
        /*
        90-100:Excellent
        80-89: great
        70-79:good
        60-69:passed
        0-59: failed
         */
        int grade = 60;
        String statement = "";
        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                statement="Excellent";
            } else if (grade >= 80) {//false if score is less than 80
                statement="Great";
            } else if (grade >= 70) {
                System.out.println("Good");
            } else if (grade >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");


            }
        } else {//if the score in not valid
            System.out.println("Invalid Score");

        }System.out.println(statement);
        System.out.println("_____________________________");
       String result= (grade >=0 && grade<=100)? (grade>=90)?"Excellent" :(grade>=80)?"Great"
        :(grade>=70)?"Good" :(grade>=60)?"Passed" :"Failed" : "Invalid Score";
        System.out.println(result);


        System.out.println("------------------------------------");
        //solution number 3
        String result2 = "";
        if (grade >= 0 && grade<=100){
         result2 = (grade>=90)?"Excellent" :(grade>=80)?"Great"
                    :(grade>=70)?"Good" :(grade>=60)?"Passed" :"Failed";
        }else{
            result2="Invalid Score";

        }
        System.out.println(result2);

    }
}
