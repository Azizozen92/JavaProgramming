package day_36_Inheritance.DinnerTasks.BookTask;

public class EBook extends Book{
    public int pages;
    public String size;

    public EBook(int pages, String size) {
        this.pages = pages;
        this.size = size;
    }

    public void setInfo(int pages) {
        this.pages = pages;
    }
    public void readBook(){
        System.out.println("Read book"+title);
    }

    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", pages=" + pages +
                ", size='" + size + '\'' +
                '}';
    }
}
