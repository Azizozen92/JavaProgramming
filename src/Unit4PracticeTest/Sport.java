package Unit4PracticeTest;

public class Sport {

    String name;
    int numOfPlayers;
    boolean teamBased;

    public void makeSport(String name, int players, boolean teams){

        name= name;
        numOfPlayers= players;
        teamBased= teams;

    }

    public String toString(){
        String msg= " The sport is: "+ name+ " and has"+
                numOfPlayers+ " players total";

        if(teamBased){
            msg= " divide into teams";
        }else{
            msg = " but there is no teams";
        }
        return msg;

    }

    public static void main(String[] args) {

        Sport soccer= new Sport();
        soccer.makeSport("soccer", 10, true);
        System.out.println(soccer);

    }
}
