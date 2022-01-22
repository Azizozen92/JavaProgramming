package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;//0 to 100
        boolean a = score >=90 && score<=100;
        boolean b = score >=80 && score<=89;
        //boolean b = score>=80 && !a
        boolean c = score >=70 && score<=79;
        boolean d = score >=60 && score<=69;
        //boolean d = >=60 && !a && !b && !c
        boolean f = score <60;
        // boolean f = !a && !b && !c && !d &&;
        if(a){
            System.out.println("Excellent");
        }
        if(b){
            System.out.println("Great");
        }
        if(c){
            System.out.println("Good");
        }
        if(d){//if the student made a d
            System.out.println("Passed");
        }
        if(f){//if student made an f
            System.out.println("Failed");
        }
        //if the student made A- excellent
        //b- great
        //c- good
        //d- passed
        //f- failed

        /*
        System.out.println(true== !false);//true
        System.out.println(!true != false);//false
        System.out.println(!false==true);//true
        System.out.println(!!false);//false
        System.out.println(!!!true);//false
        */
    }
}
