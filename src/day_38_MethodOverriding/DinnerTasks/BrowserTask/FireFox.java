package day_38_MethodOverriding.DinnerTasks.BrowserTask;

import day_38_MethodOverriding.DinnerTasks.BrowserTask.Browser;

public class FireFox extends Browser {
    @Override
    public void openBrowser() {
        System.out.println("Opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing firefox browser");
    }
}
