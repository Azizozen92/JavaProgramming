package day_11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName= "firefox";
        String result="";
        switch (browserName){
            case "chrome":
            result="chrome";
            break;
            case "firefox":
                result="firefox";
                break;
            case "edge":
                result="edge";
                break;
            case " opera":
                result="opera";
                break;
            case " safari":
                result="safari";
                break;
            default:
                result="Invalid Browser";

        }
        System.out.println(result);
    }
}
