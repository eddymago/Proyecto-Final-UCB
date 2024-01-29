package task.addUser;

import actions.Click;
import actions.Perform;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.user.AddPage;
import task.login.Login;

public class User {
    private static final Logger log = LogManager.getLogger(Login.class);
    public static void selectusers(WebDriver webDriver) {

        log.info("selecciona Lines");
        Perform.perform(webDriver, AddPage.seleccionarusuarios, 1);
        log.info("selecciona User Lines");
        Perform.perform(webDriver, AddPage.selecuser, 2);
        log.info("dar click en Add Line ");
        Click.on(webDriver, AddPage.usuario);
    }
}




