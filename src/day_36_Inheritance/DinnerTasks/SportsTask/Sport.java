package day_36_Inheritance.DinnerTasks.SportsTask;

public class Sport {

    public String name;
    public int numberOfPlayers,numberOfReferee;
    public String rules;

    public void setInfo(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
        this.rules = rules;
    }
    public void play(){
        System.out.println(name+" is playing");
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }
}
