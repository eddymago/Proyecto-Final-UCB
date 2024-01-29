package task.addUser;

import actions.Click;
import actions.Perform;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.user.Mod;
import task.login.Login;

public class Modif {
    private static final Logger log = LogManager.getLogger(Login.class);
    public static void selectusers(WebDriver webDriver) {

        log.info("selecciona lines");
        Perform.perform(webDriver, Mod.seleccionarusuario, 1);
        log.info("selecciona users lines");
        Perform.perform(webDriver, Mod.selecusers, 2);
        log.info("dar click en manage lines");
        Click.on(webDriver, Mod.manage);
    }
}

