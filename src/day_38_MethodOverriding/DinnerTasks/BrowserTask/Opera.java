package day_38_MethodOverriding.DinnerTasks.BrowserTask;

import day_38_MethodOverriding.DinnerTasks.BrowserTask.Browser;

public class Opera extends Browser {

    @Override
    public void openBrowser() {
        System.out.println("Opening opera browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing opera browser");
    }
}
