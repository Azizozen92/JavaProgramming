package day_31_Constructors.PracticeTasks;

public class Address {

    public int buildingNumber;
    public String streetName;
    public String city;
    public String state;
    public int zipCode;

    public Address(int buildingNumber, String streetName, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber+" "+streetName+" \n"+city+" "+state+", "+zipCode;

    }
}
