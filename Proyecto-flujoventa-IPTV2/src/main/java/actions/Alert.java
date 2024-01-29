package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert {
    public static void acept(WebDriver webDriver) {

        webDriver.switchTo().alert().accept();
    }

    public static void cancel(WebDriver webDriver) {

        webDriver.switchTo().alert().dismiss();
    }

}
