package task.addReseller;

import actions.Click;
import actions.Enter;
import actions.Perform;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.login.LoginPage;
import page.reseller.ResellerPage;
import page.support.Support;
import task.login.Login;

public class SelectReseller {
    private static final Logger log = LogManager.getLogger(Login.class);
    public static void seleccionreseller(WebDriver webDriver) {
        log.info("seleccionar Users");
        Perform.perform(webDriver, ResellerPage.seleccionarsubreseller, 0);
        log.info("dar click en en boton Add User");
        Click.on(webDriver,ResellerPage.generarreseller);

    }
}
