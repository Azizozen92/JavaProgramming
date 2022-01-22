package day_36_Inheritance.DinnerTasks.BookTask;

public class AudioBook extends Book{

    public String length,narrator;

    public void setInfo(String length, String narrator) {

        this.length = length;
        this.narrator = narrator;
    }
    public void listen(){
        System.out.println("Listening to "+narrator);
    }

    public String toString() {

        return "AudioBook{" +
                "length='" + length + '\'' +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
