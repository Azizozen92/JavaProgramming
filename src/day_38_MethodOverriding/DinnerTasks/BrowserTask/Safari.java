package day_38_MethodOverriding.DinnerTasks.BrowserTask;

import day_38_MethodOverriding.DinnerTasks.BrowserTask.Browser;

public class Safari extends Browser {
    @Override
    public void openBrowser() {
        System.out.println("Opening Safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Safari browser");
    }
}
