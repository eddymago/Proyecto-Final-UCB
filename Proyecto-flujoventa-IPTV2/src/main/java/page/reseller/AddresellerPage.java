package page.reseller;

import org.openqa.selenium.By;

public class AddresellerPage {

    public static By userreseller = By.id("username");

    public static By emailreseller = By.id("email");

    public static By notareseller = By.id("notes");
    public static By clickreview = By.xpath("//*[contains(text(),'Review Purchase')]");

    public static By generarreseller = By.xpath("//*[@value='Purchase']");
    public static By seleccionaraddcredits = By.xpath("//*[@class='mdi mdi-coin']");
    public static By addcredits = By.xpath("//*[@class='form-control text-center']");
    public static By clickpurcha = By.id("credits_submit");
}
