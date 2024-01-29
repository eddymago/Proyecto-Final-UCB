package task.generalTrial;


import actions.Click;
import actions.Enter;
import model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.trial.AdduserPage;
import task.login.Login;


public class AddUser {
    private static final Logger log = LogManager.getLogger(Login.class);
    public static void adduser(WebDriver webDriver) {


        User user = new User();
        log.info("llena el usuario con datos aleatorios");
        Enter.text(webDriver, AdduserPage.usernameprueba, user.getUsername());
        log.info("llena la nota");
        Enter.text(webDriver, AdduserPage.notaprueba, "usuario final");
        log.info("dar click en review purchase para la prueba");
        Click.on(webDriver, AdduserPage.clickreview);
        log.info("dar click en purchase para la prueba");
        Click.on(webDriver, AdduserPage.generarprueba);
        log.info("verificar el mensaje de exito para la prueba");
        Click.on(webDriver, AdduserPage.mensajeexitoso);
        log.info("editar");
        Click.on(webDriver, AdduserPage.generarfin);
        log.info("escoger paquete");
        Click.on(webDriver, AdduserPage.clickescogerpaquete);
        log.info("seleccionar el 2x1");
        Click.on(webDriver, AdduserPage.click2x1);
        log.info("dar click en review purchase para el usuario final");
        Click.on(webDriver, AdduserPage.generarusuario);
        log.info("dar click en purchase para el usiario final");
        Click.on(webDriver, AdduserPage.generarfinal);
        log.info("verificar el mensaje de exito para el usiario final");
        Click.on(webDriver, AdduserPage.mensajeexitosousu);


    }


}







