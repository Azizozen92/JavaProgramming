package Unit4PracticeTest;

public class Test1 {

    String name;
    int numOfTests;

    public void setInfo(String name, int numOfTests)

    {
        this.name= name;
        this.numOfTests= numOfTests;

    }

    public static void main(String[] args) {

        Test1 t= new Test1();
        t.setInfo("smoke test",15);


    }
}
