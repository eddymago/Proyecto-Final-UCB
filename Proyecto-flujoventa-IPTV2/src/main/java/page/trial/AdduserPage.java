package page.trial;

import org.openqa.selenium.By;

public class AdduserPage {
    // para la prueba gratis
    public static By usernameprueba = By.id("username");
    public static By notaprueba = By.id("reseller_notes");

    public static By clickreview = By.xpath("//*[contains(text(),'Review Purchase')]");

    public static By generarprueba = By.xpath("//*[@value='Purchase']");
    public static By mensajeexitoso = By.xpath("//*[@class='alert alert-success alert-dismissible fade show']");

    // para añadir el usuaruio de prueba a usuario final
     public static By generarfin = By.xpath("//*[@class='mdi mdi-pencil-outline']");
     public static By clickescogerpaquete = By.id("select2-package-container");

    public static By click2x1 = By.xpath("//*[contains(text(),'PLAN 2X1 》  3 DISPOSITIVOS  1 $ CREDITOS  SIN XXX')]");

    public static By generarusuario = By.xpath("//*[contains(text(),'Review Purchase')]");
    public static By generarfinal = By.xpath("//*[@value='Purchase']");

    public static By mensajeexitosousu = By.xpath("//*[@class='alert alert-success alert-dismissible fade show']");

}


