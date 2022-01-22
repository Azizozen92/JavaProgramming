package day_39_Recap.StatesTask;

public class StatesObjects {

    public static void main(String[] args) {

        Virginia virginia = new Virginia();
        System.out.println(virginia);

        California california = new California();
        System.out.println(california);

        Texas texas = new Texas();
        System.out.println(texas);

        Florida florida = new Florida();
        System.out.println(florida);
        florida.setPopulation(239847239);
        System.out.println(florida);
    }
}
