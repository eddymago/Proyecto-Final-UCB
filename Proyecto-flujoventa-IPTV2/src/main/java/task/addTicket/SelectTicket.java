package task.addTicket;

import actions.Click;
import actions.Enter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.support.Support;
import page.support.SuppotPage;
import task.login.Login;

public class SelectTicket {
    private static final Logger log = LogManager.getLogger(Login.class);
    public static void seleccionticket(WebDriver webDriver) {
        log.info("dar click en el icono de mensaje");
        Click.on(webDriver, Support.seleccionasupport);
        log.info("dar click click en el boton create ticket");
        Click.on(webDriver, Support.selectcrearticket);


    }
}


