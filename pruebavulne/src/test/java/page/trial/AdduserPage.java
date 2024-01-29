package page.trial;

import org.openqa.selenium.By;

public class AdduserPage {
    public static By usernameprueba = By.id("username");
    public static By notaprueba = By.id("reseller_notes");

    public static By clickreview = By.xpath("//*[contains(text(),'Review Purchase')]");

    public static By generarprueba = By.xpath("//*[@value='Purchase']");
    public static By mensajeexitoso = By.xpath("//*[@class='alert alert-success alert-dismissible fade show']");


}
