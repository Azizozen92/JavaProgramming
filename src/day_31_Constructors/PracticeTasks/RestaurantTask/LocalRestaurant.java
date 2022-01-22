package day_31_Constructors.PracticeTasks.RestaurantTask;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Aziz","Adana",5);

        Server server1 = new Server("Hamid",123,30,true);
        Server server2= new Server("Mustafa",124,20,true);
        Server server3= new Server("Safiye",125,10,true);
        Server server4= new Server("Hamza",126,9,false);
        Server[] servers={server1,server2,server3,server4};
        restaurant1.hireServers(servers);

        Chef chef1 = new Chef("John",127,20,false);
        Chef chef2 = new Chef("Jeff",128,18,true);
        Chef chef3 = new Chef("Chris",129,22,true);
        Chef chef4 = new Chef("Jack",130,23,true);
        Chef[] chefs={chef1,chef2,chef3,chef4};
        restaurant1.hireChef(chefs);

        System.out.println(restaurant1);

        for (Server server : restaurant1.serversList) {
            System.out.println(server);
        }
        for (Chef chef : restaurant1.chefsList) {
            System.out.println(chef);
        }
        


    }
}
