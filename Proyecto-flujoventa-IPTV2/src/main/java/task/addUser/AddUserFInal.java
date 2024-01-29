package task.addUser;

import actions.Click;
import actions.Enter;
import model.Addre;
import model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.trial.AdduserPage;
import page.user.AddPage;
import page.user.UserPage;
import task.login.Login;

public class AddUserFInal {
    private static final Logger log = LogManager.getLogger(Login.class);
    public static void adduserfinal(WebDriver webDriver) {

        model.User user = new User();
        model.Addre addre = new Addre();
        log.info("llena los datos del usuario final con datos aleatorios");
        Enter.text(webDriver, UserPage.usernamefinal, user.getUsername());
        log.info("llenar datos de correo aleatoriamente");
        Enter.text(webDriver, UserPage.correo, addre.getAddress());
        log.info("llenar la nota del usuario");
        Enter.text(webDriver, UserPage.notausuario, "nota final");
        log.info("dar click en review purchase para el usuario final");
        Click.on(webDriver, UserPage.clickreviewpurchase);
        log.info("dar click en el boton purchase para el usuario final");
        Click.on(webDriver, UserPage.usuariofinal);
        log.info("verificar el mensaje de exito");
        Click.on(webDriver, UserPage.mensajeexitosofinal);

    }
}


