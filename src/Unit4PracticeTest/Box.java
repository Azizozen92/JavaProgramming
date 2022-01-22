package Unit4PracticeTest;

public class Box {

    double width;
    double length;

    public String print(){

        return "width: "+ width + ", length: " + length;

    }

    public void setInfo( double width, double length){
        this.width= width;
        this.length=length;

    }


    public String toString() {
        return "Box{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
class UseBoxes{

    public static void main(String[] args) {

        Box box = new Box();
        box.setInfo(5,7);
        System.out.print(box);
    }

}
