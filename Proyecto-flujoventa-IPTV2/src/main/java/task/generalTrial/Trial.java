package task.generalTrial;

import actions.Click;
import actions.Perform;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.trial.TrialPage;
import page.user.AddPage;
import task.login.Login;

public class Trial {
    private static final Logger log = LogManager.getLogger(Login.class);
    public static void selectuser(WebDriver webDriver) {

        log.info("selecciona Lines");
        Perform.perform(webDriver,TrialPage.seleccionar , 1);
        log.info("selecciona User Lines");
        Perform.perform(webDriver, TrialPage.seleccionaruserline, 2);
        log.info("dar click en Add Line ");
        Click.on(webDriver,TrialPage.generar );

    }
}



