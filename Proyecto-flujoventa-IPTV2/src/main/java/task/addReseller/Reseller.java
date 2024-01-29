package task.addReseller;

import actions.Click;
import actions.Enter;
import actions.Perform;
import com.github.javafaker.Address;
import model.Addre;
import model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page.reseller.AddresellerPage;
import page.reseller.ResellerPage;
import page.support.SuppotPage;
import task.login.Login;

public class Reseller {
    private static final Logger log = LogManager.getLogger(Login.class);
    public static void selectresellers(WebDriver webDriver) {
        model.User user = new User();
        model.Addre addre = new Addre();

        log.info("borrar lo que ya esta escrito");
        Enter.clear(webDriver, AddresellerPage.userreseller);
        log.info("llenar datos de reseller aleatiriamente");
        Enter.text(webDriver, AddresellerPage.userreseller, user.getUsername());
        log.info("llenar datos de correo aleatoriamente");
        Enter.text(webDriver, AddresellerPage.emailreseller, addre.getAddress());
        log.info("llenar nota del reseller");
        Enter.text(webDriver, AddresellerPage.notareseller, "Reseller La paz");
        log.info("dar click en el boton review purchase del reseller");
        Click.on(webDriver, AddresellerPage.clickreview);
        log.info("dar click en el boton review del reseller");
        Click.on(webDriver, AddresellerPage.generarreseller);
        log.info("dar click en el boton añador creditos");
        Click.on(webDriver,AddresellerPage.seleccionaraddcredits);
        log.info("colocar la cantidad de creditos asignados");
        Enter.text(webDriver, AddresellerPage.addcredits, "1");
        log.info("dar click en el boton purchase con la cantidad de creditos asignados");
        Click.on(webDriver,AddresellerPage.clickpurcha);


    }
}





