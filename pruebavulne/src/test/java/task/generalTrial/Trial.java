package task.generalTrial;

import actions.Click;
import actions.Perform;
import org.openqa.selenium.WebDriver;
import page.trial.TrialPage;

public class Trial {
    public static void selectuser(WebDriver webDriver) {


        Perform.perform(webDriver, TrialPage.seleccionar, 1);

        Perform.perform(webDriver, TrialPage.seleccionaruserline, 2);

        Click.on(webDriver, TrialPage.generar);

    }
}
