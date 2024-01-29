package testSuite;

import actions.Label;

import browser.ChromeProxy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page.trial.AdduserPage;
import task.generalTrial.AddUser;
import task.generalTrial.Trial;
import task.login.Login;


public class OrderTest {

    private WebDriver driver = new ChromeProxy().create();;

    @BeforeEach
    public void openBrowser(){
        driver.get("http://tpi.lat:2095/subreseller/");
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void testOrder() throws InterruptedException {
        // login
        Login.ingresarCredenciales(driver);
        // seleccionar usuario
        Trial.selectuser(driver);
        // adicionar usuario de prueba
        AddUser.adduser(driver);
    }
}
