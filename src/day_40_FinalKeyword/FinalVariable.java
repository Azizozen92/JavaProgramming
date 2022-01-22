package day_40_FinalKeyword;

public class FinalVariable {
    final String birthday;
    final static String name;

    static{
        name="Batch 25";
    }

    public FinalVariable(String birthday){
        this.birthday = birthday;
    }

    public static void main(String[] args) {
        final double pi = 3.14;

        final String name;

        name = "Java";
    }

}
