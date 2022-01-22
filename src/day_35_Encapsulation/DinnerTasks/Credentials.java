package day_35_Encapsulation.DinnerTasks;

public class Credentials {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public boolean isStrongPassword(String password) {
        int digitCount=0;
        int letterCount=0;
        int specialCount=0;

        if(!(password.length()>=8) || password.contains(" ")){
            System.err.println("Password doesnt contain enough character or contains space");
            System.exit(0);
        }
        for (int i = 0; i < password.length(); i++) {

            if (Character.isDigit(password.charAt(i))){
                digitCount++;
            }else if (Character.isLetter(password.charAt(i))){
                letterCount++;
            }else{
                specialCount++;
            }
        }
        boolean isStrongPassword = specialCount>=1 && digitCount>=1 && letterCount>=1;

        return isStrongPassword;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public Credentials(String username, String password) {

        setUsername(username);
        setPassword(password);

    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    }

