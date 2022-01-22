package day_31_Constructors.PracticeTasks;

import day_31_Constructors.ScrumTask.Developer;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country;
    public String title;
    public String releaseDate;
    public String director;
    public ArrayList<String> castList=new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }
    public void addCast(String cast){
        castList.add(cast);
    }
    public void addCasts(String[]casts){
        castList.addAll(Arrays.asList(casts));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts: "+castList.size()+
                '}';
    }
}
