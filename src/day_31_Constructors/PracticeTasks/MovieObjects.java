package day_31_Constructors.PracticeTasks;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA","Journey to SDET: Cydeo Batch 23","10/25/2021","Kuzzat Altay");
        movie1.addCast("Asiya");
        String[] casts={"Adam","Muhtar","Aziz","Hamid","Ahmet","Ali","Hasan","Hakki"};
        movie1.addCasts(casts);
        System.out.println(movie1);

    }
}
