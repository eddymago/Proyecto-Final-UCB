package task.login;

import actions.Click;
import actions.Enter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.login.LoginPage;

public class Login {
    private static final Logger log = LogManager.getLogger(Login.class);
    public static void ingresarCredenciales(WebDriver webDriver) {

        log.info("llenar el usuario");
        Enter.text(webDriver, LoginPage.username, "Emachuca21");
        log.info("llenar el password");
        Enter.text(webDriver, LoginPage.password, "Eddyson");
        log.info("Dar click en botona aceptar");
        Click.on(webDriver, LoginPage.botonaceptar);
    }
}
