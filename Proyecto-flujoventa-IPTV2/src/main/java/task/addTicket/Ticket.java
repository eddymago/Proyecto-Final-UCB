package task.addTicket;

import actions.Click;
import actions.Enter;
import model.Supp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.support.SuppotPage;
import task.login.Login;

public class Ticket {
    private static final Logger log = LogManager.getLogger(Login.class);

    public static void ingresarReclamo(WebDriver webDriver) {
        model.Supp supp = new Supp();
        log.info("llenar los datos en subject con datos aleatorios");
        Enter.text(webDriver, SuppotPage.subject, supp.getSubject());
        log.info("llenar los datos en message con datos aleatorios");
        Enter.text(webDriver, SuppotPage.menssage, supp.getMessages());
        log.info("dar click en el boton create");
        Click.on(webDriver, SuppotPage.clickcreate);
    }
}
