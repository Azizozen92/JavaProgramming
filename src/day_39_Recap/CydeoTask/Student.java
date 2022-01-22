package day_39_Recap.CydeoTask;

public class Student extends Person{

    private int studentId;
    private String fieldsOfStudy;

    public Student(String name, int age, char gender, int studentId, String fieldsOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldsOfStudy(fieldsOfStudy);
    }

    public void setStudentId(int studentId) {
        if(studentId<0){
            System.err.println("Invalid student ID "+studentId);
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public void setFieldsOfStudy(String fieldsOfStudy) {
        if(fieldsOfStudy.isEmpty() || fieldsOfStudy.isBlank()){
            System.err.println("Invalid field of study");
            System.exit(1);
        }
        this.fieldsOfStudy = fieldsOfStudy;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFieldsOfStudy() {
        return fieldsOfStudy;
    }

    public String toString() {
        return super.toString() +
                ", studentId=" + studentId +
                ", fieldsOfStudy='" + fieldsOfStudy + '\'' ;
    }
}

