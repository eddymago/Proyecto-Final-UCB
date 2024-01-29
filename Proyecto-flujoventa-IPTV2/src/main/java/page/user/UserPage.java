package page.user;

import org.openqa.selenium.By;

public class UserPage {

    public static By usernamefinal= By.id("username");
    public static By notausuario = By.id("reseller_notes");

    public static By correo = By.id("contact");

    public static By clickreviewpurchase = By.xpath("//*[contains(text(),'Review Purchase')]");

    public static By usuariofinal = By.xpath("//*[@value='Purchase']");

    public static By mensajeexitosofinal = By.xpath("//*[@class='alert alert-success alert-dismissible fade show']");
}
