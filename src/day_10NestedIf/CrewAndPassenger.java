package day_10NestedIf;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int p = 100;
        String result = " ";
        if(p==50||p==100||p==75){
          result=  (p==50)?"20 crew and 30 passenger":(p==75)?"25 crew and 50 passenger"
                    :"30 crew, and 70 passengers";}
        System.out.println("Total: "+p+" ===>  "+  result);

        /*
        2. Create a class called CrewAndPassanger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

        Total: 50  ====> 20 crew, 30 passengers
        Total: 75  ====> 25 crew, 50 passengers
        Total: 100 ====> 30 crew, 70 passengers
        Any other number of people on the ship is not valid

        NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMEN
    }
}
   */
    }}