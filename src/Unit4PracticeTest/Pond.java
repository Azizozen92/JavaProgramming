package Unit4PracticeTest;

public class Pond {

    static Water water;
    static String color;

    public Pond ()   { //This line
        water = new Water(color);
    }
}

class  Water{

    String color;

    public Water(String color){
        this.color=color;

    }
}
