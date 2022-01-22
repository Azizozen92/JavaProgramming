package day_31_Constructors.PracticeTasks.RestaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numberOfStars;
    ArrayList<Server>serversList=new ArrayList<>();
    ArrayList<Chef>chefsList=new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }
    public void hireServer(Server server){
        serversList.add(server);
    }
    public void hireServers(Server[]servers){
        serversList.addAll(Arrays.asList(servers));
    }
    public void hireChef(Chef chef){
        chefsList.add(chef);
    }
    public void hireChef(Chef[] chefs){
        chefsList.addAll(Arrays.asList(chefs));
    }
    public void terminateChef(int employeeID){
        chefsList.removeIf(p-> p.employeeID == employeeID);
    }
    public void terminateServer(int employeeID){
        serversList.removeIf(p-> p.employeeID == employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", numberOfServers="+serversList.size()+
                ", numberOfChefs=" + chefsList.size() +

                '}';
    }
}

