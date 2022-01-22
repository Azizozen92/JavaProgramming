package day_10NestedIf;

public class Browser {
    public static void main(String[] args) {
        String browserName = "firefox";
        String result="";
        boolean validBrowser=browserName=="chrome"||browserName=="firefox"||browserName=="opera"||browserName=="safari"||browserName=="edge";
        if(validBrowser){
            if (browserName == "chrome") {
                result="Chrome browser is selected";
            }else if(browserName=="firefox"){
                result="Firefox browser is selected";
            }else if( browserName=="opera"){
                result="Opera browser is selected";
            }else if (browserName=="Safari"){
                result="Safari browser is selected";
            }else {
                result = "Edge Browser is selected";
            }

        }else {
            result="Invalid Browser name";
        }
        System.out.println(result);
        //1. Create a class called Browser. Write a program that can display the name of selected browser
        //        1. declare a String variable named browserName
        //        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        //        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name
        //
        //        Ex:
        //            String browser = "chrome";
        //
        //        Output:
        //            Chrome Browser is selected
        //
        //        Note: MUST use nested if
    }
}
