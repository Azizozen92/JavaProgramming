package day08_IfStatements;

public class School {
    public static void main(String[] args) {
        //2.  Given a number(byte) grade level determine and print which school type someone is in.
        //            grade level and types are:
        //                    1-5: Elementary school
        //                    6-8: Middle school
        //                    9-12: High school
        //                    13-16: College
        //                    17-18: Grad School
        int age = 2;
        boolean elementarySchool = age>=1 && age<=5;
        boolean middleSchool = age>=6 && age<=8;
        boolean highSchool = age>=9 && age<=12;
        boolean college = age>=13 && age<=16;
        boolean gradSchool = age>=17&&age<=18;
        if(elementarySchool){
            System.out.println("Elementary School");
        }
        if(middleSchool){
            System.out.println("Middle School");
        }
        if(highSchool){
            System.out.println("High School");
        }
        if(college){
            System.out.println("College");
        }
        if (gradSchool){
            System.out.println("Grad School");
        }
    }
}
