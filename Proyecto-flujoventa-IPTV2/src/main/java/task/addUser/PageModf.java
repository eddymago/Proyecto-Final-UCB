package task.addUser;

import actions.Alert;
import actions.Click;
import actions.Enter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.login.LoginPage;
import page.user.*;
import task.login.Login;


public class PageModf {
    private static final Logger log = LogManager.getLogger(Login.class);

    public static void edit(WebDriver webDriver) {

        log.info("selecciona editar usuario");
        Click.on(webDriver, PageMod.seleccionareditar);
        log.info("seleccionar paquete");
        Click.on(webDriver, PageMod.clickescopaq);
        log.info("seleccionar paquete 2x1");
        Click.on(webDriver, PageMod.click2x1);
        log.info("click en boton purchase para aumetar paquete");
        Click.on(webDriver, PageMod.generarusuario);
        log.info("click en purchase para aumentar paquete");
        Click.on(webDriver, PageMod.generarfinal);
        log.info("seleccionar desahilitar");
        Click.on(webDriver, PageMod.seleccionardisable);

    }
}


