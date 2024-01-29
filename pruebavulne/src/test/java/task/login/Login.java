package task.login;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import page.login.LoginPage;

public class Login {
    public static void ingresarCredenciales(WebDriver webDriver) {
        Enter.text(webDriver, LoginPage.username, "Emachuca21");
        Enter.text(webDriver, LoginPage.password, "Eddyson");
        Click.on(webDriver, LoginPage.botonaceptar);
    }
}
