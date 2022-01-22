package day_35_Encapsulation.DinnerTasks;

public class CredentialsCheck {
    public static void main(String[] args) {
        Credentials credentials1 = new Credentials("AzizOzen","Babacim 123!");
        System.out.println(credentials1.isStrongPassword(credentials1.getPassword()));

    }
}
