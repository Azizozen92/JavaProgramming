package day_30_CustomClasses;

public class Family {

    public String names;
    public double age;
    public String nickName;
    public String favoriteColor;
    public char gender;
    public int weight;
    public boolean hasJob;

    public String toString() {
        return "Family{" +
                "names='" + names + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                ", favoriteColor='" + favoriteColor + '\'' +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", hasJob=" + hasJob +
                '}';
    }

    public void setInfo(String names, double age, String nickName, String favoriteColor, char gender, int weight, boolean hasJob) {
        this.names = names;
        this.age = age;
        this.nickName = nickName;
        this.favoriteColor = favoriteColor;
        this.gender = gender;
        this.weight = weight;
        this.hasJob = hasJob;
    }
}
