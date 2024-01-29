package task.generalTrial;


import actions.Click;
import actions.Enter;
import model.User;
import org.openqa.selenium.WebDriver;
import page.trial.AdduserPage;


public class AddUser {
    public static void adduser(WebDriver webDriver) {

        User user = new User();

        Enter.text(webDriver, AdduserPage.usernameprueba, user.getUsername());
        Enter.text(webDriver, AdduserPage.notaprueba, "notaprueba");
        Click.on(webDriver, AdduserPage.clickreview);
        Click.on(webDriver, AdduserPage.generarprueba);

    }


}
