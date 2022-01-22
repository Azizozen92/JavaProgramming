package day_11_Switch_Scanner;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber=3;
        String result="";
        boolean valid = floorNumber==1||floorNumber==2||floorNumber==3;
        if(valid){
            switch (floorNumber){
                case 1:
                    result="Floor 1 is selected.Companies: Lobby, Verizon,Starbucks";
                break;
                    case 2:
                    result="Floor 2 is selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    result="Floor 3 is selected. Companies: Lyft,BofA,Steak House";
            }
        }else{
            result="invalid floor";
        } System.out.println(result);
    }
}
